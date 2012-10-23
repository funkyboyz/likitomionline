<%-- 
    Document   : index
    Created on : Sep 17, 2012, 11:17:26 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript" src="../js/jquery.tables.js"></script>
        <script type="text/javascript">
            function loadContent(url) {
                $("#content").load(url);
            }
    
            $(document).ready(function() {
                $('#cartForm fieldset').each(function() {
                    $(this)
                    .find('a')
                    .click(function() {
                        var url = $(this).attr('href');
                        loadContent(url);
                        return false;
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
        </script>
    </head>
    <body>
        <form id="cartForm" name="cart">
            <fieldset>
                <legend>Cart</legend>
                <div id="productType">
                    <div class="prod-img"></div>
                    <h3>ข้อมูลตะกร้าสินค้า (Cart Detail)</h3>
                    <p class="pg">
                        คุณมี 0 สินค้า ในตะกร้า
                    </p>
                    <div id="checkOutBtn">
                        <input type="submit" value="Check Out" name="checkOutBtn" />                        
                        <a href="../shop/index.jsp">
                            <input type="button" value="Continue Shopping" name="ContShop" />
                        </a>
                    </div>
                </div>
                <table class="sortable" border="0">
                    <thead>
                        <tr>
                            <th></th>
                            <th>รหัสสินค้า</th>
                            <th>ชื่อสินค้า</th>
                            <th>ลูกค้า</th>
                            <th>ชนิดสินค้า</th>
                            <th>ราคา</th>
                            <th>จำนวน</th>
                            <th>เป็นเงิน</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <img src="../img/product/small/box_rsc.png" width="100" height="69" alt="box_rsc"/>
                            </td>
                            <td>Product Code</td>
                            <td>Product Name</td>
                            <td>Customer</td>
                            <td>Product Type</td>
                            <td>100</td>
                            <td>
                                <input type="text" name="quantity" value="" />
                            </td>
                            <td>100</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>net price</td>
                            <td>100</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>Vat 7%</td>
                            <td>7</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>Total Price</td>
                            <td>107</td>
                        </tr>
                    </tfoot>
                </table>
            </fieldset>
        </form>
    </body>
</html>
