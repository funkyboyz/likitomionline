<%-- 
    Document   : index
    Created on : Sep 5, 2012, 11:55:59 PM
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
                $('#navigator').each(function() {
                    if($(this).hide()) {
                        $(this).fadeIn('slow');
                        $('#content').animate({ width : '81%'}, 'normal');
                        return false;
                    } 
                });
            });
            
            function loadContent(url) {
                $('#content').load(url);
            }
            
            $(document).ready(function() {
                $('#service a').each(function() {
                    $(this).click(function() {
                        var url = $(this).attr('href');
                        loadContent(url);
                        return false;
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="serv-page">
            <fieldset>
                <legend>Service</legend>
                <ul>
                    <li id="service">
                        <div class="serv-img"></div>
                        <ul>
                            <li>
                                <a href="../shop/service/new_order.jsp">สั่งทำสินค้าใหม่</a>
                            </li>
                            <li><a href="../shop/service/quatation.jsp">ขอใบเสนอราคา (Quatation)</a>
                            </li>
                            <li><a href="../shop/service/upload_po.jsp">สั่งซื้อสินค้า (PO)</a>
                            </li>                            
                        </ul>
                    </li>
                </ul>
            </fieldset>
        </div>
    </body>
</html>
