<%-- 
    Document   : index
    Created on : Sep 5, 2012, 11:55:50 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript" src="../js/jquery.tables.js"></script>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript">
            function loadContent(url) {
                $('#content').load(url);
            }
            
            $(document).ready(function() {
                $('#productTypeDetail').each(function() {
                    $(this)
                    .find('a')
                    .click(function() {
                        var url = $(this).attr('href');
                        loadContent(url);
                        return false;
                    });
                });
            });
        </script>
    </head>
    <body>
        <form name="productTypeDetail" id="productTypeDetail">
            <fieldset>
                <legend>Product Type Detail</legend>
                <div id="productType">
                    <img class="prod-img" src="../img/prod-type/singleface.jpg" alt="singleface"/>
                    <h3>แผ่นกระดาษลูกฟูกหน้าเดียว (Product type 1)</h3>
                    <p class="pg">
                        ประกอบด้วยกระดาษทำผิว 1 ด้าน ประกบตัวลอนลูกฟูก นิยมใช้สำหรับการห่อหุ้มสินค้าเพื่อกันการกระแทก
                    </p>
                </div>
                <table class="sortable paginated">
                    <thead>
                        <tr>
                            <th></th>
                            <th class="sort-alpha">รหัสสินค้า</th>
                            <th class="sort-alpha">ชื่อสินค้า</th>
                            <th class="sort-alpha">ลูกค้า</th>
                            <th>ชนิดสินค้า</th>
                            <th>รายละเอียด</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <img src="../img/product/small/box_partition.png" width="100" height="69" alt="ไส้กล่อง, box partition"/>
                            </td>
                            <td><a href="../shop/product/product_detail.jsp">bbb123</a></td>
                            <td><a href="../shop/product/product_detail.jsp">Product 1</a></td>
                            <td><a href="#">Customer 1</a></td>
                            <td><a href="#">Product Type 1</a></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <img src="../img/product/small/box_rsc.png" width="100" height="69" alt="กล่อง RSC, box RSC"/>
                            </td>
                            <td><a href="#">aaa123</a></td>
                            <td><a href="#">Product 2</a></td>
                            <td><a href="#">Customer 2</a></td>
                            <td><a href="#">Product Type 2</a></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <img src="../img/product/small/box_tele.png" width="100" height="56" alt="box_tele"/>
                            </td>
                            <td><a href="#">ccc123</a></td>
                            <td><a href="#">Product 3</a></td>
                            <td><a href="#">Customer 3</a></td>
                            <td><a href="#">Product Type 3</a></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </fieldset>
        </form>
    </body>
</html>
