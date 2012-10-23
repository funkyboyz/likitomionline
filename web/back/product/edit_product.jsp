<%-- 
    Document   : edit_product
    Created on : Sep 24, 2012, 12:10:57 AM
    Author     : funkyboyz_book4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
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
            
//            $(document).ready(function() {
//                $('.regis-column-1 li').eq(1).addClass('swapUpload').hide();
//                $(':input').addClass('un_modified').attr('readonly', true);
//                $('#edit_product').click(function() {
//                    $(':input').removeClass('un_modified').attr('readonly', false);
//                });
//                
//                $('#new_product').click(function() {
//                    $('.regis-column-1 li').eq(0).hide('slow');
//                    $('.swapUpload').show('slow');
//                    $(':input').attr('readonly', false).val('');
//                });
//            });
        </script>
    </head>
    <body>
        <form id="editProduct" name="editProduct">
            <fieldset>
                <legend>แก้ไขสินค้า (Edit Product)</legend>
                <ul class="regis-column-1">
                    <h3>ข้อมูลสินค้า</h3>
                    <li>
                        <label for="product_img">รูป</label>
                        <a id="product_img" class="fancybox" rel="gallery" href="../img/product/large/SHH-240.jpg">
                            <img src="../img/product/small/box_tele.png" width="100" height="56" alt="box_tele"/>
                        </a>
                    </li>
                    <li>
                        <label for="realUpload">อัพโหลดรูป</label>
                        <div id="uploadBtn">
                            <input id="realUpload" class="multi-pt" type="file" name="" value="" accept="gif|jpg|png|pdf" />
                        </div>
                    </li>
                    <li>
                        <label for="prod_code">รหัสสินค้า</label>
                        <input id="prod_code" class="required" type="text" name="prod_code" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="prod_name">ชื่อสินค้า</label>
                        <input id="prod_name" class="required" type="text" name="prod_name" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="prod_type">ชนิดสินค้า</label>
                        <input id="prod_type" class="required" type="text" name="prod_type" value="" />
                        <span>(required)</span>
                    </li>
                </ul>
                <ul class="regis-column-2">
                    <h3>ข้อมูลวัตถุดิบ</h3>
                    <li>
                        <label for="flute">Flute</label>
                        <input id="flute" class="required" type="text" name="flute" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="df">DF</label>
                        <input id="df" class="required" type="text" name="df" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="bm">BM</label>
                        <input id="bm" class="required" type="text" name="bm" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="bl">BL</label>
                        <input id="bl" class="required" type="text" name="bl" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="cm">CM</label>
                        <input id="cm" class="required" type="text" name="cm" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="cl">CL</label>
                        <input id="cl" class="required" type="text" name="cl" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="length">Length(mm.)</label>
                        <input id="length" class="required" type="text" name="length" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="width">Width(mm.)</label>
                        <input id="width" class="required" type="text" name="width" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="height">Height(mm.)</label>
                        <input id="height" class="required" type="text" name="height" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="qty_set">Quality Set</label>
                        <input id="qty_set" class="required" type="text" name="qty_set" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="ink_color">Ink Color</label>
                        <input id="ink_color" class="required" type="text" name="ink_color" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="box_style">Box Style</label>
                        <input id="box_style" class="required" type="text" name="box_style" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="qty_level">Quality Level</label>
                        <input id="qty_level" class="required" type="text" name="qty_level" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="paper_width">Paper Width</label>
                        <input id="paper_width" class="required" type="text" name="paper_width" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="price">Price</label>
                        <input id="price" class="required" type="text" name="price" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="prod_comment">หมายเหตุ</label>
                        <textarea id="prod_comment" name="prod_type_comment" readonly="readonly" rows="10" cols="30">
                        </textarea>
                    </li>
                    <!--</ul>-->
                    <!--                <ul class="regis-column-3">
                                        <h3>Upload Picture</h3>
                                        <li>
                                            <label for="realUpload">อัพโหลดรูป</label>
                                            <div id="uploadBtn">
                                                <input id="realUpload" class="multi-pt tooltip" type="file" name="" value="" accept="gif|jpg|png|pdf" />
                                            </div>
                                        </li>
                                    </ul>-->
                    <!--<ul class="regis-column-4">-->
                    <li>
                        <input type="submit" id="submitProdMgmt" class="acceptForm" value="Save" name="submitProdMgmt" />
                        <input type="reset" id="cancelProdMgmt" value="Cancel" name="cancelProdMgmt" />
                    </li>
                </ul>
            </fieldset>
        </form>
    </body>
</html>
