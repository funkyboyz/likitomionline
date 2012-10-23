<%-- 
    Document   : index
    Created on : Sep 2, 2012, 8:21:13 PM
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
                    $(this).hide(function() {
                        $(this).fadeOut('slow');
                    }, function() {
                        $('#content').animate({ width : '97%' }, 'slow');
                        return false;
                    });
                });
            });
        </script>
    </head>
    <body>
        <form name="join_us" id="formJoinUs">
            <div class="topic">
                <h2>Careers</h2>
                <h3>ตำแหน่งที่เปิดรับสมัคร</h3>
                <ul class="apply-job">
                    <li><a href="#">Production Manager</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย</li>
                            <li>อายุ 30 ปีขึ้นไป</li>
                            <li>วุฒิปริญญาตรีวิศวกรรม / วิทยาศาสตร์ หรือสาขาอื่นๆ ที่เกี่ยวข้อง</li>
                            <li>มีประสบการณ์ด้านการจัดการ, บริหารโรงงาน อย่างน้อย 5 ปี</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Planning and Control Chief</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย, หญิง</li>
                            <li>อายุ 30 ปีขึ้นไป</li>
                            <li>วุฒิปริญญาตรี สาขาบริหารธุรกิจหรือวิศวอุตสาหกรรม</li>
                            <li>มีประสบการณ์ด้านการวางแผนผลิต, จัดซื้อหรือบริหารการผลิต อย่างน้อย 5 ปีขึ้นไป</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Sale Representative</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย, หญิง</li>
                            <li>อายุ 25 ปีขึ้นไป , บุคลิคดี, มีพาหนะส่วนตัว</li>
                            <li>วุฒิปริญญาตรี สาขาการตลาด, บัญชี, คอมพิวเตอร์, การจัดการ</li>
                            <li>มีประสบการณ์งานขายอุตสาหกรรมมาก่อน</li>
                            <li>มีความรู้ความสามารถด้านภาษาอังกฤษ หรือญี่ปุ่น จะพิจารณาเป็นพิเศษ</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Sale Office</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศหญิง</li>
                            <li>อายุ 24 ปีขึ้นไป</li>
                            <li>วุฒิปริญญาตรี สาขาการตลาด, บัญชี, คอมพิวเตอร์, การจัดการ</li>
                            <li>สามารถพูด อ่าน และเขียนภาษาอังกฤษ หรือญี่ปุ่นในระดับพอใช้</li>
                            <li>สามารถขับรถยนต์ได้</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Assistant Chief of Quality Assurance (QA) and Quality Control (QC)</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย, หญิง</li>
                            <li>อายุ 30 ปีขึ้นไป</li>
                            <li>วุฒิ ป.ตรี สาขาวิทยาศาสตร์ หรืออื่นๆที่เกี่ยวข้อง</li>
                            <li>บุคลิกดี, มีภาวะผู้นำ, มีความรู้เกี่ยวกับระบบการจัดการด้าน ISO9001, ISO14001 </li>
                            <li>มีประสบการณ์ทำงานด้านการประกันคุณภาพในอุตสาหกรรมการผลิตไม่น้อยกว่า 3 ปี</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Staff of Quality Assurance (QA) and Quality Control (QC)</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย, หญิง</li>
                            <li>อายุ 20 ปี ขึ้นไป</li>
                            <li>วุฒิ ม.6 - ปวช. (ทุกสาขา)</li>
                            <li>มีความรู้เกี่ยวกับระบบ ISO9001, ISO14001 </li>
                            <li>สามารถใช้ตลับเมตรได้</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Assistant Warehouse Supervisor</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย, หญิง</li>
                            <li>อายุ 30 ปีขึ้นไป</li>
                            <li>วุฒิปริญญาตรี ทุกสาขา</li>
                            <li>มีประสบการณ์ด้านคลังสินค้า 3 ปีขึ้นไป</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Production Workers</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย</li>
                            <li>วุฒิ ป.4 - ม.6 ไม่จำกัดอายุ (วุฒิ ม.6 บรรจุเป็นพนักงานรายเดือน)</li>
                            <li>ทำงานเป็นกะได้</li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                    <li><a href="#">Operator for Administrative Staff</a>
                        <ul>
                            <h3>คุณสมบัติ</h3>
                            <li>เพศชาย</li>
                            <li>อายุ 21 ปี ขึ้นไป</li>
                            <li>วุฒิ ปวช. - ปวส. สาขา ช่างกล, ช่างยนต์, อิเล็กทรอนิกส์ </li>
                            <a href="mailto:hr_likitomi@hotmail.com">Apply Job</a>
                        </ul>
                    </li>
                </ul>
                <ul class="notation">
                    <h3>Note:</h3>
                    <p class="pg">If you have experience all jobs. Would be an advantage</p>
                </ul>
                <ul class="notation">
                    <h3>Documentation for the apply job</h3>
                    <li>Certified Copy of Identification Card 2 set</li>
                    <li>Certified Copy of House Registration 1 set</li>
                    <li>Certified Copy of Educational Background 1 set</li>
                    <li>Photo 2 set</li>
                </ul>
                <ul class="notation">
                    <h3>Email</h3>
                    <p class="pg">ท่านสามารถสมัครงานโดยส่งประวัติส่วนตัวทางอีเมล์ได้ที่ 
                        <a class="mailto" href="mailto:personnel@likitomi.co.th">personnel@likitomi.co.th</a>
                        และ
                        <a class="mailto" href="mailto:hr_likitomi@hotmail.com">hr_likitomi@hotmail.com</a>
                    </p>
                </ul>
                </ul>
            </div>
        </form>
    </body>
</html>
