<%-- 
    Document   : product_type_mgmt
    Created on : Sep 21, 2012, 4:16:59 AM
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
                $(function() {
                    $("#spanProductId").load("controller.ProductServlet?getOption");
                    $("#spanUnitId").load("controller.UnitProductServlet?getOption");
                
                    bindDataGridImport();
                });
            
                function bindDataGridImport() {
                    $("#spanGridImport").load("operation/import/grid.jsp");
                }
                
                function loadContent(url) {
                    $('#content').load(url);
                }
            
                $('#productTypeMgmtForm').each(function() {
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
                
                //                $('#realUpload').tooltip();
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
        <form id="productTypeMgmtForm" name="productTypeMgmtForm">
            <fieldset>
                <legend>บริหารจัดการข้อมูลชนิดสินค้า (Product Type Management)</legend>
                <div id="newItem">
                    <a href="../back/product/AddProductType">เพิ่มชนิดสินค้า</a>
                </div>
                <table class="sortable paginated">
                    <thead>
                        <tr>
                            <th class="sort-alpha">รหัส</th>
                            <th>รูป</th>
                            <th class="sort-alpha">ชนิดสินค้า</th>
                            <th>รายละเอียด</th>
                            <th>แก้ไข</th>
                            <th>ลบ</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="productType" items="${result}">
                        <tr>
                            <td>${ProductType.prodTypeCode}</td>
                            <td><img src="../img/prod-type/${productType.picture}.jpg"/></td>
                            <td>${ProductType.prodTypeName}</td>
                            <td>${ProductType.description}</td>
                            <td>
                                <a href="../back/product/GetProductTypeDetail?id=${productType.id}">
                                    <div class="editImage"></div>
                                </a>
                            </td>
                            <td>
                                <a href="DeleteProductType?id=${productType.id}">
                                    <div class="delImage"></div>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </fieldset>
        </form>
    </body>
</html>
