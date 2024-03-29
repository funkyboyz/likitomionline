package likitomi.jsp.model;

// @author funkyboyz_book4
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private Connection connect;

    public Database() {
        try {
            Class.forName(DatabaseInfo.DRIVERS);

            connect = DriverManager.getConnection(
                    DatabaseInfo.URL,
                    DatabaseInfo.USER,
                    DatabaseInfo.PASS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void close() {
        try {
            if(connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public int add(String sql, Object... args) {
        try {
            PreparedStatement pstmt;
            pstmt = connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            for(int i = 0; i < args.length; i++) {
                pstmt.setObject(i+1, args[i]);
            }
            pstmt.executeUpdate();
            
//            find auto increment ID
            ResultSet rs = pstmt.getGeneratedKeys();
            
            rs.next();
            
            return rs.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public int update(String sql, Object... args) {
        try {
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            for(int i = 0; i < args.length; i++) {
                pstmt.setObject(i + 1, args[i]);
            }
            
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public int remove(String sql, int id) {
        return update(sql, id);
    }
    
    public Map<String, Object> querySingle(String sql, Object... args) {
        try {
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            for(int i = 0; i < args.length; i++) {
                pstmt.setObject(i + 1, args[i]);
            }
            
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            
            if(rs.next()) {
                Map<String, Object> map;
                map = new HashMap<String, Object>();
                
                for(int i = 1; i < md.getColumnCount(); i++) {
                    map.put(md.getColumnLabel(i), rs.getObject(i));
                }
                return map;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Map<String, Object>> queryList(String sql, Object... args) {
        try {
            List<Map<String, Object>> list;
            list = new ArrayList<Map<String, Object>>();
            
            PreparedStatement pstmt = connect.prepareStatement(sql);
            
            for(int i = 0; i < args.length; i++) {
                pstmt.setObject(i + 1, args[i]);
            }
            
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            
            while(rs.next()) {
                Map<String, Object> map;
                map = new HashMap<String, Object>();
                
                for(int i = 1; i <= md.getColumnCount(); i++) {
                    map.put(md.getColumnLabel(i), rs.getObject(i));
                }
                list.add(map);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void beginTransaction() {
        try {
            connect.setAutoCommit(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void commit() {
        try {
            connect.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void rollback() {
        try {
            connect.rollback();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
