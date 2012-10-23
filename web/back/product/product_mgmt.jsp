<%-- 
    Document   : index
    Created on : Sep 21, 2012, 3:48:02 AM
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
            $(document).ready(function() {
                function loadContent(url) {
                    $('#content').load(url);
                }
            
                $('#productManagement').each(function() {
                    $(this)
                    .find('a')
                    .click(function() {
                        var url = $(this).attr('href');
                        loadContent(url);
                        return false;
                    });
                });
            });
            
            $(document).ready(function() {
                $('#navigator').each(function() {
                    if($(this).hide()) {
                        $(this).fadeIn('slow');
                        $('#content').animate({ width : '81%'}, 'normal');
                        return false;
                    } 
                });
                
                $('#realUpload').tooltip();
            });
            
            $(function(){
                $('.multi-pt').MultiFile({
                    accept:'gif|jpg|png|pdf', max:5, STRING: {
                        remove:'x',
                        selected:'เลือกไฟล์ $file',
                        denied:'ไม่อนุญาตให้อัพโหลดไฟล์ $ext!\nคุณสามารถอัพโหลดไฟล์ชนิด .png, .jpg, .gif เท่านั้น',
                        duplicate:'มีรายการนี้แล้ว กรุณาลองอีกครั้ง:\n$file!'
                    }
                });
            });
        </script>
    </head>
    <body>
        <form id="productManagement" name="productManagement">
            <fieldset>
                <legend>บริหารจัดการข้อมูลสินค้า (Product Management)</legend>
                <div id="newItem">
                    <a href="../back/product/add_product.jsp">เพิ่มสินค้า</a>
                </div>
                <table class="sortable paginated">
                    <thead>
                        <tr>
                            <th></th>
                            <th class="sort-alpha">รหัสสินค้า</th>
                            <th class="sort-alpha">ชื่อสินค้า</th>
                            <th class="sort-alpha">ลูกค้า</th>
                            <th class="sort-alpha">ชนิดสินค้า</th>
                            <th>รายละเอียด</th>
                            <th>แก้ไข</th>
                            <th>ลบ</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <img src="../img/product/small/box_partition.png" width="100" height="69" alt="ไส้กล่อง, box partition"/>
                            </td>
                            <td><a href="../back/product/edit_product.jsp">bbb123</a></td>
                            <td><a href="../back/product/edit_product.jsp">Product 1</a></td>
                            <td><a href="#">Customer 1</a></td>
                            <td><a href="#">Product Type 1</a></td>
                            <td></td>
                            <td>
                                <a href="GetProductDetail?id=${productType.id}">
                                    <div class="editImage"></div>
                                </a>
                            </td>
                            <td>
                                <a href="DeleteProduct?id=${productType.id}">
                                    <div class="delImage"></div>
                                </a>
                            </td>
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
                            <td>
                                <a href="GetProductDetail?id=${productType.id}">
                                    <div class="editImage"></div>
                                </a>
                            </td>
                            <td>
                                <a href="DeleteProduct?id=${productType.id}">
                                    <div class="delImage"></div>
                                </a>
                            </td>
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
                            <td>
                                <a href="GetProductDetail?id=${productType.id}">
                                    <div class="editImage"></div>
                                </a>
                            </td>
                            <td>
                                <a href="DeleteProduct?id=${productType.id}">
                                    <div class="delImage"></div>
                                </a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </fieldset>
        </form>
    </body>
</html>
