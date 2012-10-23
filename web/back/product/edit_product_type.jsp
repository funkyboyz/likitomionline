<%-- 
    Document   : edit_product_type
    Created on : Oct 22, 2012, 1:18:35 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script type="text/javascript" src="../js/jquery.forms.js"></script>
<script type="text/javascript">
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

<form name="editProductType" id="editProductType">
    <fieldset>
        <legend>แก้ไขชนิดสินค้า (Edit Product Type)</legend>
        <ul class="regis-column-1">
            <h3>ข้อมูลชนิดสินค้า</h3>
            <li>
                <label for="prod_type_code">รหัสชนิดสินค้า</label>
                <input id="prod_type_code" class="required" type="text" name="prod_type_code" value="" />
                <span>(required)</span>
            </li>
            <li>
                <label for="prod_type_name">ชื่อชนิดสินค้า</label>
                <input id="prod_type_name" class="required" type="text" name="prod_type_name" value="" />
                <span>(required)</span>
            </li>
            <li>
                <label for="prod_type_comment">หมายเหตุ</label>
                <textarea id="prod_type_comment" name="prod_type_comment" rows="10" cols="30">
                </textarea>
            </li>
            <li>
                <label for="realUpload">อัพโหลดรูป</label>
                <div id="uploadBtn" title="">
                    <input id="realUpload" class="multi-pt" type="file" name="" value="" accept="gif|jpg|png|pdf" />
                </div>
            </li>
            <li>
                <input type="submit" id="submitProdTypeMgmt" value="Save" name="submitProdTypeMgmt" />
                <input type="reset" id="cancelProdTypeMgmt" value="Cancel" name="cancelProdTypeMgmt" />
            </li>
        </ul>
    </fieldset>
</form>