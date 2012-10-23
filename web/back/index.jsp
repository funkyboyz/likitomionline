<%-- 
    Document   : home
    Created on : Aug 31, 2012, 9:21:38 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type=text/javascript">
            $(document).ready(function() {
                function loadContent(url) {
                    $('#content').load(url);
                }
            
                $('#backOfficeForm').each(function() {
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
        <form id="backOfficeForm" name="backOfficeForm">
            <fieldset>
                <legend>Back Office</legend>
                <ul>
                    <li>
                        <div class="back-img"></div>
                        <ul>
                            <li><a href="../back/product/ShowAllProductType">บริหารจัดการข้อมูลชนิดสินค้า (Product Type Management)</a></li>
                            <li><a href="../back/product/ShowAllProducts">บริหารจัดการข้อมูลสินค้า (Product Management)</a></li>
                            <li><a href="#">บริหารจัดการข้อมูลพนักงาน (Employee Management)</a></li>
                            <li><a href="#">รายงานการขาย (Report Sale)</a></li> 
                        </ul>
                    </li>
                </ul>
            </fieldset>
        </form>
    </body>
</html>
