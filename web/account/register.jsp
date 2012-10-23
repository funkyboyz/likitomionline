<%-- 
    Document   : register
    Created on : Sep 19, 2012, 3:10:08 AM
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
                $('#district').tooltip();
            });
            
            $(document).ready(function() {
                $('.regis-column-3 li ul').hide();
                $('#cust_group').each(function() {
                    $(':select').eq(1).click(function() {
                        $('.regis-column-3 li ul').show();
                        return false;
                    });
                });
            });
        </script>
    </head>
    <body>
        <form id="registerForm" name="registerForm">
            <fieldset>
                <legend>ลงทะเบียน (Registration)</legend>
                <ul class="regis-column-1">
                    <h3>ข้อมูลการลงชื่อเข้าใช้</h3>
                    <li>
                        <label for="username">Username</label>
                        <input id="username" class="required" type="text" name="username" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="password">Password</label>
                        <input id="password" class="required" type="password" name="password" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="re-password">Verify Password</label>
                        <input id="re-password" class="required" type="password" name="re-password" value="" />
                        <span>(required)</span>
                    </li>
                </ul>
                <ul class="regis-column-2">
                    <h3>ข้อมูลส่วนตัว</h3>
                    <li>
                        <label for="firstname">ชื่อ</label>
                        <input id="firstname" class="required" type="text" name="firstname" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="lastname">นามสกุล</label>
                        <input id="lastname" class="required" type="text" name="lastname" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="sex">เพศ</label>
                        <select id="sex" class="required" name="sex">
                            <option>ชาย</option>
                            <option>หญิง</option>
                        </select>
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="date-of-birth">วัน / เดือน / ปีเกิด</label>
                        <input id="dob" class="required" type="text" name="date-of-birth" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="address">ที่อยู่</label>
                        <textarea id="address" class="required" name="address" rows="5" cols="30"></textarea>
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="district">อำเภอ</label>
                        <select id="district" class="required" name="district" title="กรุณาเลือกจังหวัดก่อน">
                            <option>- Select -</option>
                        </select>
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="province">จังหวัด</label>
                        <select id="province" class="required" name="province">
                            <option>- Select -</option>
                        </select>
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="postcode">รหัสไปรษณีย์</label>
                        <input id="postcode" class="required" type="text" name="postcode" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="mobile">เบอร์โทรศัพท์มือถือ</label>
                        <input id="mobile-no" type="text" name="mobile" value="" />
                    </li>
                    <li>
                        <label for="landline">เบอร์โทรศัพท์</label>
                        <input id="land-line" class="required" type="text" name="landline" value="" />
                        <span>(required)</span>
                    </li>
                    <li>
                        <label for="fax">เบอร์แฟกซ์</label>
                        <input id="fax-no" type="text" name="fax" value="" />
                    </li>
                    <li>
                        <label for="email">อีเมล์</label>
                        <input id="email" class="required" type="text" name="email" value="" />
                        <span>(required)</span>
                    </li>
                </ul>
                <ul class="regis-column-3">
                    <h3>ข้อมูลธุรกิจ</h3>
                    <li>
                        <label for="cust_group">กลุ่มลูกค้า</label>
                        <select id="cust_group" name="cust_group">
                            <option>บุคคลธรรมดา</option>
                            <option>นิติบุคคล</option>
                        </select>
                        <ul>
                            <li>
                                <label for="company_name">บริษัท</label>
                                <input id="cust_company" type="text" name="company_name" value="" />
                            </li>
                            <li>
                                <label for="company_address">ที่อยู่</label>
                                <textarea id="cust_comp_addr" name="company_address" rows="5" cols="30"></textarea>
                            </li>
                            <li>
                                <label for="company_district">อำเภอ</label>
                                <select id="cust_comp_district" name="company_district">
                                    <option>- Select -</option>
                                </select>
                            </li>
                            <li>
                                <label for="company_province">จังหวัด</label>
                                <select id="cust_comp_province" name="company_province">
                                    <option>- Select -</option>
                                </select>
                            </li>
                            <li>
                                <label for="company_postcode">รหัสไปรษณีย์</label>
                                <input id="cust_comp_postcode" type="text" name="company_postcode" value="" />
                            </li>
                            <li>
                                <label for="company_mobile">เบอร์โทรศัพท์มือถือ</label>
                                <input id="cust_comp_mobile" type="text" name="company_mobile" value="" />
                            </li>
                            <li>
                                <label for="company_landline">เบอร์โทรศัพท์</label>
                                <input id="cust_comp_landline" type="text" name="company_landline" value="" />
                            </li>
                            <li>
                                <label for="company_faxline">เบอร์แฟกซ์</label>
                                <input id="cust_comp_fax" type="text" name="company_faxline" value="" />
                            </li>
                            <li>
                                <label for="company_email">อีเมล์</label>
                                <input id="cust_comp_email" type="text" name="company_email" value="" />
                            </li>
                            <li>
                                <label for="company_web">เว็บไซต์</label>
                                <input id="cust_comp_website" type="text" name="company_web" value="" />
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="regis-column-4">
                    <h3>ยืนยันบุคคล</h3>
                    <li>
                        <div id="captcha">
                            <label for="captcha">กรุณากรอกรายการตามภาพ</label>
                            <img src="../img/product/medium/SHH-240.jpg" width="300" height="150" alt="SHH-240"/>
                        </div>
                    </li>
                </ul>
                <ul class="regis-column-5">
                    <h3>ยืนยันการสมัครใช้บริการ</h3>
                    <div id="regis-check">
                        <input type="checkbox" name="registerCheck" value="ON" />
                        <label>ยืนยันการสมัครใช้บริการ</label>
                    </div>
                    <li>
                        <input type="submit" id="acceptRegister" class="acceptForm" value="Register" name="acceptRegister" />
                        <input type="reset" id="cancelRegister" value="Cancel" name="cancelRegister" />
                    </li>
                </ul>
            </fieldset>
        </form>
    </body>
</html>
