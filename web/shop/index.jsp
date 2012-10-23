<%-- 
    Document   : index
    Created on : Sep 2, 2012, 8:23:23 PM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript">
    function loadContent(url) {
        $("#content").load(url);
    }

    $(document).ready(function() {
        $('.prod-page a').each(function() {
            $(this).click(function() {
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
    });
</script>

<div class="prod-page">
    <fieldset>
        <legend>Product</legend>
        <ul>
            <li id="productType">
                <a href="../shop/product/index.jsp">
                    <img class="prod-img" src="../img/prod-type/singleface.jpg" alt="singleface"/>
                    <h3>แผ่นกระดาษลูกฟูกหน้าเดียว (Product type 1)</h3>
                    <p class="pg">
                        ประกอบด้วยกระดาษทำผิว 1 ด้าน ประกบตัวลอนลูกฟูก นิยมใช้สำหรับการห่อหุ้มสินค้าเพื่อกันการกระแทก
                    </p>
                </a>
            </li>
            <li id="productType">
                <a href="../shop/product/index.jsp">
                    <img class="prod-img" src="../img/prod-type/singlewall.jpg" alt="singlewall"/>
                    <h3>แผ่นกระดาษลูกฟูก 3 ชั้น Single Wall Corrugated Board (Product type 2)</h3>
                    <p class="pg">
                        ประกอบด้วยกระดาษทำผิวด้านหน้าและหลังตรงกลางเป็นลอนลูกฟูก อาจเป็นลอน B , C นิยมใช้กับงานกล่องทั่วไป
                    </p>
                </a>
            </li>
            <li id="productType">
                <a href="../shop/product/index.jsp">
                    <img class="prod-img" src="../img/prod-type/doublewall.jpg" alt="doublewall"/>
                    <h3>แผ่นกระดาษลูกฟูก 5 ชั้น (Product type 3)</h3>
                    <p class="pg">
                        ประกอบด้วยแผ่นกระดาษเรียบ 3 แผ่น และลอนลูกฟูกอีก  2  ชั้น นิยมใช้กับงานกล่องที่ต้องรับน้ำหนักมาก มักเป็นลอน B และลอน C
                    </p>
                </a>
            </li>
            <li id="productType">
                <a href="../shop/product/index.jsp">
                    <img class="prod-img" src="../img/prod-type/pallet.gif" alt="singleface"/>
                    <h3>Pallet กระดาษ (Product type 4)</h3>
                    <p class="pg">
                        ประกอบด้วยแผ่นกระดาษเรียบ 3 แผ่น และลอนลูกฟูกอีก  2  ชั้น นิยมใช้กับวางสินค้า สามารถรับน้ำหนักได้ดี มักเป็นลอน B และลอน C
                    </p>
                </a>
            </li>
        </ul>
    </fieldset>
</div>