<%-- 
    Document   : index
    Created on : Sep 19, 2012, 1:40:53 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript">
            $(document).ready(function() {
                function loadContent(url) {
                    $('#content').load(url);
                }
            
                $(document).ready(function() {
                    $('#accountForm').each(function() {
                        $(this)
                        .find('a')
                        .click(function() {
                            var url = $(this).attr('href');
                            loadContent(url);
                            return false;
                        });
                    });
                });
            });
                            
            $(document).ready(function(){
                $('#navigator').each(function() {
                    if($(this).hide()) {
                        $(this).fadeIn('slow');
                        $('#content').animate({ width : '81%'}, 'normal');
                        return false;
                    } 
                });
            });
            
            $(document).ready(function() {
                $("a[rel*=leanModal]").leanModal();
            });
        </script>
    </head>
    <body>
        <form id="accountForm" name="accountForm">
            <fieldset>
                <legend>Account</legend>
                <ul>
                    <li>
                        <div class="acc-img"></div>
                        <ul>
                            <li><a href="../account/login.jsp" rel="leanModal">ลงชื่อเข้าใช้ (Login)</a></li>
                            <li><a href="../account/register.jsp">สมัครใช้บริการ (Register)</a></li>
                            <li><a href="#ForgetUsername">ลืมชื่อผู้ใช้ (Forget Username)</a></li>                            
                            <li><a href="#ForgetPassword">ลืมรหัสผ่าน (Forget Password)</a></li>                            
                        </ul>
                    </li>
                </ul>
            </fieldset>
        </form>
    </body>
</html>
