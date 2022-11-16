# use casestudy6;
# use casestudy6;


select * from account;
insert into account(id, created_at, updated_at, password, user_name) value (1, '2022-01-01', '2022-01-02', '123456', 'admin@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (2, '2022-04-13', '2022-05-17', '123456', 'company@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (3, '2022-03-06', '2022-03-09', '123456', 'company1@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (4, '2022-02-15', '2022-05-05', '123456', 'company2@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (5, '2022-01-09', '2022-02-26', '123456', 'company3@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (6, '2022-06-10', '2022-07-05', '123456', 'company4@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (7, '2022-12-10', '2022-12-19', '123456', 'company5@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (8, '2022-07-19', '2022-11-21', '123456', 'company6@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (9, '2022-12-11', '2022-11-17', '123456', 'company7@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (10, '2022-08-21', '2022-11-05', '123456', 'company8@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (11, '2022-08-28', '2022-09-12', '123456', 'company9@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (12, '2022-11-16', '2022-11-18', '123456', 'user@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (13, '2022-01-12', '2022-01-23', '123456', 'user1@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (14, '2022-09-26', '2022-10-09', '123456', 'user2@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (15, '2022-05-04', '2022-09-11', '123456', 'user3@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (16, '2022-08-13', '2022-09-13', '123456', 'user4@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (17, '2022-03-13', '2022-04-16', '123456', 'user5@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (18, '2022-01-10', '2022-11-22', '123456', 'user6@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (19, '2022-02-10', '2022-12-24', '123456', 'user7@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (20, '2022-05-10', '2022-12-01', '123456', 'user8@gmail.com');
insert into account(id, created_at, updated_at, password, user_name) value (21, '2022-08-10', '2022-12-02', '123456', 'user9@gmail.com');

select * from app_role;
insert into app_role(id, name) VALUE (1, 'ROLE_ADMIN');
insert into app_role(id, name) VALUE (2, 'ROLE_COMPANY');
insert into app_role(id, name) VALUE (3, 'ROLE_USER');

select * from account_app_role;
insert into account_app_role(account_id, app_role_id) VALUE (1,1);
insert into account_app_role(account_id, app_role_id) VALUE (2,2);
insert into account_app_role(account_id, app_role_id) VALUE (3,2);
insert into account_app_role(account_id, app_role_id) VALUE (4,2);
insert into account_app_role(account_id, app_role_id) VALUE (5,2);
insert into account_app_role(account_id, app_role_id) VALUE (6,2);
insert into account_app_role(account_id, app_role_id) VALUE (7,2);
insert into account_app_role(account_id, app_role_id) VALUE (8,2);
insert into account_app_role(account_id, app_role_id) VALUE (9,2);
insert into account_app_role(account_id, app_role_id) VALUE (10,2);
insert into account_app_role(account_id, app_role_id) VALUE (11,3);
insert into account_app_role(account_id, app_role_id) VALUE (12,3);
insert into account_app_role(account_id, app_role_id) VALUE (13,3);
insert into account_app_role(account_id, app_role_id) VALUE (14,3);
insert into account_app_role(account_id, app_role_id) VALUE (15,3);
insert into account_app_role(account_id, app_role_id) VALUE (16,3);
insert into account_app_role(account_id, app_role_id) VALUE (17,3);
insert into account_app_role(account_id, app_role_id) VALUE (18,3);
insert into account_app_role(account_id, app_role_id) VALUE (19,3);
insert into account_app_role(account_id, app_role_id) VALUE (20,3);
insert into account_app_role(account_id, app_role_id) VALUE (21,3);



select * from company;
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (1, '2022-01-13', '2022-01-16', 'Số 54 Giang Văn Minh, Phường Đội Cấn, Quận Ba Đình, Thành phố Hà Nội, Việt Nam','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/274400672_5387975407897325_6330285426164669412_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=OkaaLGXjj7EAX9seaqW&_nc_ht=scontent.fhan17-1.fna&oh=00_AfAh8LGbutZlKhY0jJ6xw_le6zlNb2uSyhxn1ATw9oG_bQ&oe=6372845A', 'https://www.facebook.com/3c.com.vn', 'https://www.google.com/maps/place/54+P.+Giang+V%C4%83n+Minh,+%C4%90%E1%BB%99i+C%E1%BA%A5n,+Ba+%C4%90%C3%ACnh,+H%C3%A0+N%E1%BB%99i,+Vi%E1%BB%87t+Nam/@21.0342736,105.8257605,17.75z/data=!4m5!3m4!1s0x3135ab0ac2211027:0x67631d1a715bfb1f!8m2!3d21.0341813!4d105.8272437?hl=vi', 'Công ty Cổ phần Máy tính - Truyền thông - Điều khiển 3C', 430, true, 2, 'Chi nhánh Hà Nội', 'Công ty Cổ phần Máy tính – Truyền thông – Điều khiển 3C (Computer – Communication – Control, 3C INC), được thành lập vào ngày 09/10/1989 tại TP. Hà Nội. 3C INC là một trong 3 công ty hoạt động trong lĩnh vực CNTT và Viễn thông đầu tiên tại Việt Nam, đã có đóng góp rất nhiều cho nền tin học non trẻ của Việt Nam vào những năm 90 của thể kỷ trước.

Với trên 30 năm xây dựng và phát triển, 3C INC đã khẳng định được vị thế của mình trên thị trường cung cấp các sản phẩm, dịch vụ đã tham gia. Hiện nay, Công ty 3C đã trở thành một trong những nhà cung cấp hàng đầu các sản phẩm, dịch vụ công nghệ cao cho ngành CNTT, ngành Viễn thông, ngành Điện và các ngành công nghiệp khác tại Việt Nam.

Kể từ khi thành lập, Công ty 3C đã tập hợp được một đội ngũ cán bộ có trình độ cao trong lĩnh vực quản lý, kinh tế và khoa học kỹ thuật, hầu hết đội ngũ này là được đào tạo tại nước ngoài hoặc các trường có chất lượng cao tại Việt Nam. Kể từ đó đến nay, nguồn nhân lực của 3C được phát triển và kế thừa theo hướng tập trung vào chất lượng để đáp ứng được các công việc đòi hỏi trình độ chuyên môn và công nghệ cao của từng giai đoạn khác nhau của công ty. Với đội ngũ cán bộ có chất lượng, 3C INC cam kết luôn đáp ứng và làm hài lòng tất cả các khách hàng sử dụng các sản phảm và dịch vụ của 3C INC cung cấp.

Các sản phẩm dịch vụ chính cung cấp cho thị trường, bao gồm các lĩnh vực chính sau:

* Lĩnh vực CNTT – Viễn thông:

o   Cung cấp, tích hợp hệ thống: Máy chủ, máy trạm, thiết bị lưu trữ, thiết bị mạng, phần mềm và các công trình thông tin liên lạc…

o   Dịch vụ: Tích hợp hệ thống máy chủ, hệ thống mạng LAN, WAN, hệ thống bảo mật mạng, xây dựng các công trình viến thông…

* Lĩnh vực Điện cao thế:

o   Cung cấp thiết bị: Máy biến áp, Máy cắt, dao cách ly, biến dòng điện, biến điện áp, tụ bù, kháng điện, máy biến áp và các vật tư phụ kiện đường dây tải điện 220kV/500kV. Các thiết bị giám sát trong trạm biến áp 500kV…

o   Dịch vụ: Cung cấp dịch vụ lắp đặt, giám sát lắp đặt các thiết bị điện cao thế 220kV/500kV

* Lĩnh vực thiết bị thí nghiệm điện:

o   Cung cấp thiết bị: thiết bị thí nghiệm điện trung và cao thế, thiết bị đo lường điện, thiết bị thí nghiệm hoá dầu,…

o   Dịch vụ: Cung cấp dịch vụ sửa chữa hiệu chuẩn các thiết bị thí nghiệm và đo lường.

* Lĩnh vực Điều khiển tự động hoá

o   Cung cấp, tích hợp hệ thống: Thiết bị SCADA cho các trạm biến áp, thiết kế và chế tạo tủ điều khiển-bảo vệ, , dây chuyền sản xuất tự động hoá…

o   Dịch vụ: Tích hợp hệ thống điều khiển tự động hoá các nhà máy và trạm điện, hệ thống đo lường điều khiển…');
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (2, '2022-03-12', '2022-03-24', 'Lô CN11+CN12, cụm Công nghiệp An Đông, thị trấn Nam Sách, huyện Nam Sách, tỉnh Hải Dương','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/301998055_5349550408496920_125672258894408650_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=4arRY_929YYAX_Dbsmx&tn=1LBugE4nVrg6EHBz&_nc_ht=scontent.fhan17-1.fna&oh=00_AfABo6tcj3AprULhmrf9iL1X2yOvS1Ki0jY759eyRj70QA&oe=63736DE5', 'https://www.facebook.com/AnPhatBioPlastics/?ref=page_internal', 'https://www.google.com/maps/place/C%C3%B4ng+ty+CP+Nh%E1%BB%B1a+%26+M%C3%B4i+tr%C6%B0%E1%BB%9Dng+xanh+An+Ph%C3%A1t/@20.9995914,106.3313484,17z/data=!3m1!4b1!4m5!3m4!1s0x31359cda72125f37:0xab658c5ed554688!8m2!3d20.9995864!4d106.3339233?hl=vi', 'Công ty cổ phần Nhựa An Phát Xanh', 1020, true, 3, 'Chi nhánh Hải Dương', 'AN PHÁT BIOPLASTICS – Nhà sản xuất và xuất khẩu bao bì màng mỏng số 1 Đông Nam Á
Công ty Cổ phần Nhựa An Phát Xanh (An Phát Bioplastics) là doanh nghiệp số 1 Đông Nam Á trong lĩnh vực sản xuất và xuất khẩu bao bì màng mỏng chất lượng cao. Nhựa An Phát Xanh hiện là công ty đại chúng, niêm yết trên sàn chứng khoán HoSE (Sở giao dịch chứng khoán Tp. Hồ Chí Minh) với mã chứng khoán là AAA.

Công ty được thành lập vào tháng 9/2002, là thành viên chủ chốt và lá cờ đầu của Tập đoàn An Phát Holdings. Với gần 20 năm kinh nghiệm, Nhựa An Phát Xanh đã và đang sở hữu tệp khách hàng lớn trong nước và quốc tế, thiết lập được mối quan hệ kinh doanh tốt đẹp với khách hàng tại hơn 50 quốc gia trên thế giới.

Cùng với việc phát triển mảng kinh doanh truyền thống là bao bì màng mỏng, trong những năm gần đây, Nhựa An Phát Xanh chuyển hướng mục tiêu chiến lược, đa dạng hóa sản phẩm, tập trung phát triển nguyên liệu sinh học phân hủy hoàn toàn AnBio và dòng sản phẩm sinh học phân hủy hoàn toàn AnEco thân thiện với môi trường như bao bì, dao, thìa, nĩa, ống hút, găng tay…, đáp ứng xu hướng tiêu dùng xanh tại Việt Nam và thế giới.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (3, '2022-06-06', '2022-06-25', 'TÒA NHÀ BITEXCO FINANCIAL TOWER, TẦNG 43A, 02 HẢI TRIỀU, PHƯỜNG BẾN NGHE, QUẬN 1, TP HỒ CHÍ MINH','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/304899325_477707747687331_2476747375404405306_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=F4yQHTaow_IAX-fwZHm&tn=1LBugE4nVrg6EHBz&_nc_ht=scontent.fhan17-1.fna&oh=00_AfC8uV62kvuKFqk51LJJ5MHDXsODLitbTsdE0a1lfDvjzw&oe=6373848F', 'https://www.facebook.com/aacorporation', 'https://www.google.com/maps/place/Bitexco+Financial+Tower/@10.7717117,106.701801,17z/data=!3m1!4b1!4m5!3m4!1s0x31752f3acf87eaeb:0xc969a1975f3be32a!8m2!3d10.7717064!4d106.7043759?hl=vi', 'CTCP xây dựng kiến trúc AA', 236, true, 4, 'Chi nhánh Hồ Chí Minh','Được thành lập vào năm 1993 tại Thành phố Hồ Chí Minh, Việt Nam, AA Corporation có một đội ngũ chuyên gia nội thất dày dặn kinh nghiệm, tay nghề xuất sắc cùng các sản phẩm đồ gỗ chất lượng vượt trội.

Sau hơn 25 năm hoạt động, từ một Công ty khởi nghiệp tại Thành phố Hồ Chí Minh, Công ty AA đã phát triển thành một tập đoàn toàn cầu với 13 công ty con hoạt động tại 7 quốc gia (Myanmar, Campuchia, Bhutan, Nhật Bản, Mỹ, Singapore, Thái Lan), xuất khẩu sản phẩm nội thất đến 40 quốc gia trên toàn thế giới.

TẦM NHÌN

Trở thành nhà thầu hoàn thiện nội thất hàng đầu thế giới
Dẫn đầu trong sản xuất đồ gỗ và xuất khẩu sản phẩm gỗ tại Việt Nam
MỤC ĐÍCH

Tiên phong dẫn bước để Việt Nam trở thành công xưởng đồ gỗ số 1 thế giới.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (4, '2022-12-05', '2022-12-18', 'Tầng 1, 2, 3 Tòa nhà Geleximco, Số 36 Hoàng Cầu, Phường Ô Chợ Dừa, Quận Đống Đa, Thành phố Hà Nội, Việt Nam','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/285670345_7923061111039134_927288667957010145_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=J0FzKiD_ae8AX_TBn3Q&_nc_ht=scontent.fhan17-1.fna&oh=00_AfBwkSfE5QSNSKO8tI7VYmqvu3Hi53FWb2RK5T9pWc3Wqw&oe=6373125D', 'https://www.facebook.com/nganhanganbinh', 'https://www.google.com/maps/place/2R9G%2BJ9H,+Ng%C3%B5+31+P.+Ho%C3%A0ng+C%E1%BA%A7u,+Ch%E1%BB%A3+D%E1%BB%ABa,+%C4%90%E1%BB%91ng+%C4%90a,+H%C3%A0+N%E1%BB%99i,+Vi%E1%BB%87t+Nam/@21.0186153,105.8228217,17.5z/data=!4m12!1m6!3m5!1s0x3135ab592dbc6b21:0x3cc92169fd2b6567!2sGeleximco+Building+-+Cho+thu%C3%AA+v%C4%83n+ph%C3%B2ng!8m2!3d21.0184458!4d105.824034!3m4!1s0x3135ab79ad30a951:0xe51a4e74c981f664!8m2!3d21.0190788!4d105.8260714?hl=vi', 'Ngân hàng TMCP An Bình (ABBANK)', 640, true, 5, 'Chi nhánh Hà Nội', 'ABBANK thành lập ngày 13 tháng 5 năm 1993, tên gọi ban đầu là Ngân hàng Thương mại Cổ phần Nông thôn An Bình.

Sau 26 năm phát triển và trưởng thành, ABBANK đã có sự bứt phá mạnh mẽ về lượng và chất với những cột mốc đáng chú ý sau [1]:

Tháng 9/2008: Maybank chính thức trở thành cổ đông chiến lược nước ngoài của ABBANK với tỷ lệ sở hữu là 15%.
Tháng 4/2008: ABBANK được trao giải "Ngân hàng thanh toán quốc tế xuất sắc 2007" do Wachoviabank – một trong bốn ngân hàng lớn nhất của Mỹ trao tặng. * ABBANK được trao giải "Nhãn hiệu nổi tiếng quốc gia 2008" do Hội sở hữu trí tuệ Việt Nam trao tặng.
Tháng 3/2008: ABBANK ký kết hợp tác chiến lược với Maybank – Ngân hàng lớn nhất Malaysia.
Tháng 10/2007: tăng vốn điều lệ lên 2300 tỷ đồng.
Tháng 5/2007: ABBANK được ban tổ chức hội chợ tài chính- ngân hàng- bảo hiểm Banking Expo 2007 trao giải thưởng Quả Cầu Vàng – the Best Banker cho ngân hàng "phát triển nhanh các sản phẩm dịch vụ công nghệ cao"
Tháng 4/2007: ABBANK trở thành thành viên của mạng thanh toán PAYNET.
Tháng 3/2007: ABBANK ký hợp đồng liên kết chiến lược với Agribank
Tháng 1/2007: tạp chí Asia Money bình chọn ABBANK là nhà phát hành trái phiếu công ty bản tệ tốt nhất châu Á
Tháng 6/12/2006: ký hợp đồng triển khai core banking solutions với Temenos và khai trương trung tâm thanh toán quốc tế tại Hà Nội.
Tháng 7/11/2006: ABBANK đã phát hành công trái phiếu của EVN cùng với ngân hàng Deustch Bank và quỹ đầu tư Vina Capital.
Năm 2005: Tập đoàn điện lực Việt Nam (EVN) trở thành cổ đông chiến lược của ABBANK.
Các cổ đông lớn khác: Tổng công ty tài chính Dầu Khí (PVFC), Công ty Xuất Nhập khẩu Tổng hợp Hà Nội (GELEXIMCO), Tập đoàn Điện lực Việt Nam (EVN), Ngân hàng Maybank (Maybank) Ngân hàng Nông nghiệp và Phát triển Nông thôn Việt Nam (Agribank).
Để đáp ứng được nhu cầu khách hàng trong nền kinh tế ngày càng phát triển cũng như mong muốn ABBANk ngày càng phát triển, tháng 3 năm 2002, ABBANK tiến hành cải cách mạnh mẽ về cơ cấu và nhân sự để tập trung vào chuyên ngành kinh doanh ngân hàng thương mại và ngân hàng đầu tư.
Ngân hàng TMCP An Bình được thành lập vào tháng 4 năm 1993 với vốn điều lệ là 1 tỷ đồng.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (5, '2022-11-05', '2022-11-17', 'Tầng 16, Tòa nhà Geleximco, 36 Hoàng Cầu, Quận Đống Đa, TP.Hà Nội','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/294549735_716600023041366_7695936480623011428_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=LqPpquVEoHQAX8WK2KQ&tn=1LBugE4nVrg6EHBz&_nc_ht=scontent.fhan17-1.fna&oh=00_AfDV22hocWRZsXVk7S6yVIDAHACvTUlSE6qh-H7WUcpkoA&oe=637289AA', 'https://www.facebook.com/chungkhoananbinh', 'https://www.google.com/maps/search/T%E1%BA%A7ng+16,+T%C3%B2a+nh%C3%A0+Geleximco,+36+Ho%C3%A0ng+C%E1%BA%A7u,+Qu%E1%BA%ADn+%C4%90%E1%BB%91ng+%C4%90a,+TP.H%C3%A0+N%E1%BB%99i/@21.0181206,105.8212661,17z/data=!3m1!4b1?hl=vi', 'Công ty Cổ phần Chứng khoán An Bình', 217, true, 6, 'Chi nhánh Hà Nội', 'Công ty Cổ phần Chứng khoán An Bình (ABS) được Uỷ ban Chứng khoán Nhà nước (UBCKNN) cấp giấy phép hoạt động ngày 29/9/2006  với vốn điều lệ ban đầu 50 tỷ đồng. Đến 08/2021, số vốn điều lệ của ABS đã tăng lên là 1.000.439.880.000 đồng.

ABS có sự hậu thuẫn mạnh mẽ từ các cổ đông chiến lược gồm: Tập đoàn Điện lực Việt Nam (EVN) – tập đoàn kinh tế đa ngành hàng đầu Việt Nam, Ngân hàng Thương mại Cổ phần An Bình (ABBank) – một trong mười ngân hàng TMCP có vốn điều lệ lớn nhất Việt Nam và Công ty Xuất nhập khẩu Tổng hợp Hà Nội (nay là Tập đoàn GELEXIMCO) – tập đoàn sản xuất và đầu tư hàng đầu mang tầm quốc tế.

ABS cung cấp những sản phẩm dịch vụ tài chính, chứng khoán chuyên nghiệp gồm: Môi giới chứng khoán; Bảo lãnh phát hành; Tự doanh chứng khoán; Tư vấn tài chính và tư vấn đầu tư chứng khoán; và Lưu ký chứng khoán cho khách hàng. ABS là công ty chứng khoán tiên phong hợp tác với các tập đoàn kinh tế lớn trong nước, các tổ chức tài chính quốc tế để mang đến những sản phẩm tốt nhất cho khách hàng Việt Nam. Hiện nay, bên cạnh trụ sở chính tại Hà Nội, ABS đã và đang mở rộng mạng lưới khách hàng tại Thành phố Hồ Chí Minh, Đà Nẵng, Hải Phòng, Cần Thơ, Thái Bình, Bắc Ninh, Vinh và Thanh Hoá.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (6, '2022-05-14', '2022-05-18', '442 Nguyễn Thị Minh Khai, Phường 5, Quận 3, Tp. HCM','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/314405711_5565231376917297_3219454624718739227_n.jpg?_nc_cat=1&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=sZPG0avr7gwAX9_bgUU&_nc_ht=scontent.fhan17-1.fna&oh=00_AfDFxAJtb_Y9hpMESr1PdmAbm_NrWWq-DaYmTnVv2XiR8Q&oe=63727CB1', 'https://www.facebook.com/NganHangACB/', 'https://www.google.com/maps/place/442+Nguy%E1%BB%85n+Th%E1%BB%8B+Minh+Khai,+Ph%C6%B0%E1%BB%9Dng+5,+Qu%E1%BA%ADn+3,+Th%C3%A0nh+ph%E1%BB%91+H%E1%BB%93+Ch%C3%AD+Minh,+Vi%E1%BB%87t+Nam/@10.7692237,106.6826434,17.25z/data=!4m5!3m4!1s0x31752f22616c3c41:0x29ba44756578db3e!8m2!3d10.7692511!4d106.6848121?hl=vi', ' Ngân hàng TMCP Á Châu', 550, true, 7, 'Chi nhánh Hồ Chí Minh', 'Ngân hàng Thương mại Cổ phần Á Châu (ACB) có tên tiếng Anh là Asia Commercial Joint Stock Bank. Là một trong những ngân hàng thương mại cổ phần hàng đầu tại Việt Nam, cùng hệ thống mạng lưới chi nhánh rộng khắp các tỉnh thành trên cả nước với đa dạng nhiều loại hình sản phẩm, dịch vụ.

Các ngành nghề kinh doanh:

Huy động vốn ngắn hạn, trung hạn và dài hạn dưới các hình thức tiền gửi có kỳ hạn, không kỳ hạn, tiếp nhận vốn ủy thác đầu tư và phát triển của các tổ chức trong nước, vay vốn của các tổ chức tín dụng khác;
Cho vay ngắn hạn, trung hạn và dài hạn;
Chiết khấu thương phiếu, trái phiếu và giấy tờ có giá;
Hùn vốn và liên doanh theo luật định;
Dịch vụ thanh toán giữa các khách hàng, thực hiện kinh doanh ngoại tệ, vàng bạc và thanh toán quốc tế, huy động các loại vốn từ nước ngoài và các dịch vụ ngân hàng khác trong quan hệ với nước ngoài khi được Ngân hàng Nhà nước cho phép;
Hoạt động bao thanh toán; đại lý bảo hiểm; Mua bán trái phiếu; hoạt động ủy thác và nhận ủy thác trước “đại lý bảo hiểm”
Cung cấp dịch vụ cho thuê tài chính
Kinh doanh chứng khoán
Môi giới và tư vấn đầu tư chứng khoán;
Lưu ký, tư vấn tài chính doanh nghiệp và bảo lãnh phát hành;
Các dịch vụ về quản lý quỹ đầu tư và khai thác tài sản, và cung cấp các dịch vụ ngân hàng khác.
Với nhiều năm hoạt động trên thị trường ACB đã và đang lấy được vị thế của một ngân hàng hàng đầu, với quy tắc hoạt động là quản lý chuyên nghiệp, tăng trưởng bền vững, thu nhập chính đáng, lợi nhuận mức hợp lý. Cùng ngành nghề kinh doanh đa dạng như huy động vốn, cho vay, chiết khấu thương phiếu, trái phiếu và giấy tờ có giá, hùn vốn, bảo hiểm, dịch vụ thanh toán, mua bán vàng, môi giới và tư vấn đầu tư chứng khoán, cho thuê tài chính, lưu ký, tư vấn tài chính doanh nghiệp và bảo lãnh phát hành...

Hiện tại, Ngân hàng ACB sở hữu hơn 350 chi nhánh và phòng giao dịch (1) với không gian giao dịch hiện đại, 11.000 máy ATM và 850 đại lý Western Union (2) đang hoạt động rộng khắp 47 tỉnh thành trong cả nước. Tổng số nhân viên đang làm việc gần 10,000 người, nhân viên đã tốt nghiệp đại học trở lên chiếm 100%.

Bên cạnh đó, Ngân hàng ACB cũng sở hữu cho mình không ít các công ty con/trực thuộc. Có thể kể đến một vài cái tên nổi bật như: Công ty Chứng khoán ACB (ACBS), Công ty cho thuê tài chính ACB (ACBL), Công ty Quản lý nợ và khai thác tài sản ACB (ACBA), Công ty Quản lý Quỹ ACB (ACBC).

Giấy chứng nhận đăng ký doanh nghiệp số: 0301452948
Đăng ký lần đầu: 19/05/1993
Đăng ký thay đổi lần thứ 29: 03/09/2014
Vốn điều lệ: 9.376.965.060.000 đồng
(Bằng chữ: Chín nghìn ba trăm bảy mươi sáu tỷ chín trăm sáu mươi lăm triệu không trăm sáu mươi nghìn đồng.)

Mã cổ phiếu: ACB' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (7, '2022-09-02', '2022-09-15', 'Lô A4, đường Bùi Viện, khu công nghiệp Nguyễn Đức Cảnh, Phường Trần Hưng Đạo, Thành phố Thái Bình, Tỉnh Thái Bình, Việt Nam','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-1/279667983_511406660422393_8331167407351535222_n.jpg?stp=dst-jpg_p200x200&_nc_cat=107&ccb=1-7&_nc_sid=c6021c&_nc_ohc=obzODf9pxNQAX9HnRCl&_nc_ht=scontent.fhan17-1.fna&oh=00_AfC4WjKTaNuoxcbjnKu-f9DRNRhkRlEwV_wodopeQlPmBg&oe=63732116', 'https://www.facebook.com/DAMSANJSC/', 'https://www.google.com/maps/search/L%C3%B4+A4,+%C4%91%C6%B0%E1%BB%9Dng+B%C3%B9i+Vi%E1%BB%87n,+khu+c%C3%B4ng+nghi%E1%BB%87p+Nguy%E1%BB%85n+%C4%90%E1%BB%A9c+C%E1%BA%A3nh,+Ph%C6%B0%E1%BB%9Dng+Tr%E1%BA%A7n+H%C6%B0ng+%C4%90%E1%BA%A1o,+Th%C3%A0nh+ph%E1%BB%91+Th%C3%A1i+B%C3%ACnh,+T%E1%BB%89nh+Th%C3%A1i+B%C3%ACnh,+Vi%E1%BB%87t+Nam/@20.4481606,106.3256783,17z/data=!3m1!4b1?hl=vi', 'CÔNG TY CỔ PHẦN DAMSAN', 330, true, 8, 'Chi nhánh Thái Bình', '[vc_row][vc_column][vc_column_text]Tên Công ty: CÔNG TY CỔ PHẦN DAMSAN
Tên Giao Dịch : DAMSAN JOINT STOCK COMPANY

Tên Viết Tắt: Damsan JSC

Mã Chứng Khoán : ADS

Địa chỉ trụ sở chính: Lô A4 – Đường Bùi Viện – KCN.Nguyễn Đức Cảnh -Thành phố Thái Bình.

Công ty được thành lập tháng 06/2006, trong suốt 10 năm qua với sự phấn đấu vươn lên và trưởng thành từ một doanh nghiệp có doanh thu khoảng 100 tỷ đồng/năm. Đến năm 2015 doanh thu của Công ty đã đạt được 1520 tỷ đồng với kim ngạch xuất nhập khẩu từ 60- 70 triệu USD/năm .Để có thành quả này do ngay từ đầu thành lập, Công ty đã có định hướng đầu tư và phát triển theo hướng hiện đại.

Mặt hàng sợi Cotton: Với diện tích đất 80.000m2, với quy mô 3 Nhà máy sợi (Nhà máy Damsan I, Nhà máy Damsan II, Nhà máy sợi EIFFEL) công  suất 16.000 tấn sợi cotton/năm  được đầu tư bởi các máy móc hiện đại nhất của Truszchler (CHLB Đức), Rieter (Thụy Sỹ), Murata, Toyta (Nhật Bản), Uster (Thụy Sỹ)… sản xuất năng suất cao, tiêu thụ  năng lượng thấp, chất lượng đáp ứng với người tiêu dùng nên sản phẩm được xuất khẩu từ 80 – 90%.

Mặt hàng khăn bông:

Năm 2015, đạt sản lượng xuất khẩu gần 1500 tấn và doanh thu gần 7 triệu USD

Sản phẩm được sản xuất trên dây chuyền công nghệ hiện đại:

– Máy dệt: Dobby: VAMATEX (Ý), Jacquard: SULZER (Thụy Sĩ) và TOYOTA (Nhật Bản).

– Máy tẩy – nhuộm: tự động hóa với toàn bộ máy dây chuyền nhập khẩu từ Hàn Quốc.

– Máy may: máy may tự động BARUDAN, BANDO

– Máy dò kim: Hashima (Nhật Bản)

Toàn bộ sản phẩm được xuất khẩu trực tiếp sang thị trường Nhật Bản.

Mục tiêu đến cuối năm 2017 sẽ mở rộng thị trường sang Úc, Mỹ và một vài nước khác trong TPP.

Ngành hàng bất động sản:

Năm 2011 là thời điểm thị trường bất động sản chìm đắm trong khủng hoảng, các nhà đầu tư bất động sản đang đội nón ra đi hoặc dừng sản xuất kinh doanh, song với Công ty cổ phần Damsan lại là cơ hội. Với các  nhà đầu tư đến sau nếu bước vào kinh doanh ở thời điểm sôi động thì không có cửa để vào. Và kết quả sau 2 năm lập dự án đầu tư, tháng 6/2013 với sự quan tâm chỉ đạo đặc biêt của UBND tỉnh Thái Bình và các cấp các ngành, Công ty chính thức khởi công đầu tư toà nhà 18 tầng tại số 56 Trần Hưng Đạo với quy mô 262 căn hộ trị giá 134 tỷ đồng, được hoàn thành và bán hết cho 262 hộ thu nhập thấp vào sinh sống, đánh dấu phong cách sống chung cư hiện đại đầu tiên của tỉnh Thái Bình.

Hiện nay Công ty đang triển khai toà nhà xã hội cho người  thu nhập thấp tại Phường Quang Trung – Thành phố Thái Bình với quy mô 15 tầng 286 căn hộ trị giá 150 tỷ đồng. Dự kiến toà nhà này sẽ được bàn giao cho các hộ dân vào sinh sống từ giữa Quý 1/2017.

Cùng với các dự án nhà ở, đất liền kề tại Phường Bồ Xuyên , Phường Quang Trung và xã Phú Xuân, 3 dự án này sẽ là 3 khu đô thị hiện đại của Công ty sẽ góp phần chỉnh trang làm thành phố Thái Bình sẽ trở thành một đô thị hiện đại đáng sống hiện nay.

Các vị cổ đông thân mến: Trong suốt 10 năm qua, Công ty vô cùng biết ơn sự tin tưởng, chung sức chung lòng, đoàn kết, đóng góp cho sự phồn thịnh của Công ty. Lãnh đạo cùng tập thể người lao động đã làm hết mình vì sự phát triển của Công ty, đảm bảo tối đa quyền lợi của các cổ đông với mức cổ tức từ 15-25%/năm.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (8, '2022-09-12', '2022-09-28', '149, Trung Kính, Phường Yên Hòa, Quận Cầu Giấy, Tp.Hà Nội','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/292716005_2060704974108053_5131765120494469347_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=YsS9CMDYsegAX_qvHTo&_nc_ht=scontent.fhan17-1.fna&oh=00_AfCkzSIW5X1Cdl321rqH92LnkPLBPSsLx_Vqk_dOKoV4PA&oe=63735300', 'https://www.facebook.com/ApaxEnglish/', 'https://www.google.com/maps/place/149+P.+Trung+Ki%CC%81nh,+Y%C3%AAn+Ho%C3%A0,+C%E1%BA%A7u+Gi%E1%BA%A5y,+H%C3%A0+N%E1%BB%99i,+Vi%E1%BB%87t+Nam/@21.0153053,105.7920689,17z/data=!3m1!4b1!4m5!3m4!1s0x3135ab583220348b:0x69b085f8b176b2d9!8m2!3d21.0153003!4d105.7946438?hl=vi', 'Công ty cổ phẩn Anh ngữ APax', 130, true, 9, 'Chi nhánh Hà Nội', 'TRUNG TÂM ANH NGỮ APAX LEADERS
“English For Future Leaders - Tiếng Anh cho thế hệ dẫn dắt tương lai”
- Apax Leaders đem đến cho thế hệ trẻ Việt Nam chìa khóa mở cánh cửa hội nhập cùng bạn bè quốc tế với tâm thế của người đứng đầu tương lai.
- Apax Leaders là thành quả kết hợp giữa Công ty Cổ phần Anh Ngữ APAX (thành viên Công ty Cổ phần Đầu tư Apax Holdings) - Tập Đoàn Giáo dục hàng đầu Hàn Quốc Chungdahm Learning với các chương trình đào tạo tiếng Anh dành riêng cho trẻ em từ độ tuổi từ 14 đến 18 tuổi. Dựa trên nền tảng xây dựng hệ sinh thái giáo dục Anh ngữ đã rất thành công tại khu vực phía Bắc, Công ty Cổ phần Anh ngữ Apax tiếp tục phát triển và mở rộng thương hiệu Apax Leaders với sứ mệnh đem đến những giá trị tri thức mới, rèn luyện kỹ năng và nuôi dưỡng đam mê để thế hệ trẻ Việt Nam tự tin hội nhập toàn cầu trong tâm thế người dẫn đầu.
- Apax Leaders hoạt động chủ yếu trong lĩnh vực đào tạo, giảng dạy tiếng Anh và phát triển kỹ năng tư duy toàn diện cho thế hệ trẻ Việt Nam.
- Apax leader tự hào là Trung tâm anh ngữ đầu tiên tại Việt Nam có tốc độ phát triển hệ thống và số lượng học viên tăng trưởng vượt bật
+ Hơn 120 Trung tâm trên toàn quốc
+ Khoảng hơn 120.000 học viên đang theo học
+ Mở rộng hơn 30 tỉnh thành
+ Cùng hơn 750 giáo viên trình độ bản ngữ, có chứng chỉ đào tạo quốc tế
- Xuyên suốt chặng hành trình xây dựng và phát triển, Apax Leaders luôn không ngừng nỗ lực, sáng tạo nên những giá trị tri thức mới, góp phần nâng cao trình độ ngoại ngữ, tăng cường khả năng tư duy sáng tạo cho trẻ ngay từ lúc khởi đầu.
- Apax Leaders áp dụng giáo trình chuẩn quốc tế, kết hợp cùng phương pháp giảng dạy tiên tiến thông qua việc tối ưu hóa công nghệ nhằm tiếp cận và gắn kết người học. Trung tâm không chỉ giúp thế hệ trẻ Việt Nam tự tin giao tiếp tiếng Anh, hội nhập cùng bạn bè quốc tế; mà còn cung cấp các kỹ năng sống cần thiết để trẻ trở thành những công dân toàn cầu.' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (9, '2022-01-09', '2022-01-29', 'Tầng 5, tòa nhà Grand Building, 32 Hòa Mã, TP. Hà Nội','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/275201463_822008365313549_32429452903138768_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=giihZZpnnocAX-upSXF&_nc_ht=scontent.fhan17-1.fna&oh=00_AfCgxxNRo_EG6Dap0FJH-G75-p5YAOBOjpNNFjUr7CZa6g&oe=6373518C', 'https://www.facebook.com/chungkhoanapg', 'https://www.google.com/maps/search/T%E1%BA%A7ng+5,+t%C3%B2a+nh%C3%A0+Grand+Building,+32+H%C3%B2a+M%C3%A3,+TP.+H%C3%A0+N%E1%BB%99i/@21.0157061,105.852779,17.25z?hl=vi', 'Công ty Cổ phần Chứng khoán APG', 410, true, 10, 'Chi nhánh Hà Nội', 'Công ty Cổ phần Chứng khoán APG (APG) được chính thức thành lập theo Giấy phép số 63/UBCK-GP của Ủy ban Chứng khoán Nhà nước vào ngày 15/11/2007; với số vốn điều lệ là: 1.463.066.120.000 VNĐ (Một ngàn bốn trăm sáu mươi ba tỷ không trăm sáu mươi sáu ngàn một trăm hai mươi ngàn đồng). Ngày 23/09/2016, Sở Giao dịch Chứng khoán Thành phố Hồ Chí Minh (HOSE) đã cấp Quyết định Niêm yết số 389/QĐ-SGDHCM cho phép Công ty Cổ phần Chứng khoán APG niêm yết cổ phiếu trên HOSE. Ngày 30/11/2016, Cổ phiếu của Công ty đã chính thức giao dịch với mã chứng khoán là APG. Vượt qua những khó khăn của sự phân chia thị trường giữa các Công ty chứng khoán, APG đã xây dựng được giá trị lớn nhất chính là niềm tin của khách hàng được tạo dựng từ phong cách chuyên nghiệp, hiệu quả kinh tế và lợi ích cho nhà đầu tư mà Công ty đã gây dựng được từ khi đi hoạt động..' );
insert into company(id, created_at, updated_at, address, image, link_fb, link_map, name, staff_number, status, account_id, branch, description) value (10, '2022-03-05', '2022-03-30', '	TẦNG 3, TTTM GRAND PLAZA, SỐ 117 TRẦN DUY HƯNG, P. TRUNG HÒA, Q. CẦU GIẤY, HÀ NỘI.','https://scontent.fhan17-1.fna.fbcdn.net/v/t39.30808-6/296306101_574062110931823_1218185551251593655_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=O49v3NIA8mQAX9zbWXK&tn=1LBugE4nVrg6EHBz&_nc_ht=scontent.fhan17-1.fna&oh=00_AfCNwqbLmAlpzCxP09M9gUOh3l-8rgG7T4UtzKQabNAijQ&oe=63733D02', 'https://www.facebook.com/ApecGroupOfficial/', 'https://www.google.com/maps/place/Grand+Plaza+Hanoi+Hotel/@21.0074352,105.7942432,17z/data=!3m1!4b1!4m8!3m7!1s0x3135ab95bd37c61f:0x6ec553a57ae27350!5m2!4m1!1i2!8m2!3d21.0074302!4d105.7968181?hl=vi', 'CTCP Tập đoàn Apec Group', 1023, true, 11, 'Chi nhánh Hà Nội', 'Công ty Cổ phần Tập đoàn Apec Group được thành lập ngày 24/11/2017, trên hành trình kiến tạo những biểu tượng hạnh phúc, Apec Group đã xây dựng một thương hiệu được thị trường đón nhận và được đối tác tin tưởng.

Với Apec Group, quản trị doanh nghiệp là sự tận dụng tối ưu hai nguồn lực quan trọng là Vốn và Con người, trong đó, những con người tài năng, tâm huyết, tử tế và phù hợp chính là chìa khóa giúp Công ty thành công và bền vững.

Bằng việc xây dựng Công ty trở thành nơi hạnh phúc nhất, sáng tạo nhất, nơi mọi người được thỏa sức làm việc với sự đam mê, tự nguyện cống hiến và tinh thần hợp tác cao độ sẽ giúp chúng tôi vượt qua được mọi thách thức và đạt được mục tiêu của mình. Để thực hiện được tầm nhìn và sứ mệnh lớn lao của mình, chúng tôi tuân thủ một cách nhất quán ba nguyên tắc sau:

Hoạt động minh bạch, hiệu quả, tiếp tục tiệm cận với những tiêu chuẩn cao của quản trị kinh doanh quốc tế

“Nhân tài” sẽ luôn là trung tâm của sự trường tồn và phát triển, đặc biệt phải xây dựng và phát huy tối đa năng lực của đội ngũ điều hành, quản lý có tâm và có tầm

Tạo ra những sản phẩm và dịch vụ với chất xám cao, đáp ứng tối đa nhu cầu của tầng lớp trung lưu ngày càng lớn mạnh Việt Nam.' );

select * from cv;
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (1, '2022-01-01', '2022-01-05', 'CV Ứng tuyển vị trí Code-BackEnd', 'https://ocnhoi.net/wp-content/uploads/2020/10/curriculum-vitae-la-gi.png', true, 9, 1);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (2, '2022-01-21', '2022-01-28', 'CV Ứng tuyển vị trí Kế toán', 'https://timviec365.vn/cv365/upload/images/cv-xin-viec%20(2)(1).jpg', true, 1, 3);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (3, '2022-02-12', '2022-02-22', 'CV Ứng tuyển vị trí Công Nhân Xưởng', 'http://i.imgur.com/jcEj1T3.jpg', true, 2, 9);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (4, '2022-03-21', '2022-03-26', 'CV Ứng tuyển vị trí Kĩ Sư đồ họa', 'https://ghichu.vn/blog/wp-content/uploads/2019/12/c%C3%A1ch-vi%E1%BA%BFt-cv-hay.png', true, 3, 2);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (5, '2022-03-09', '2022-03-14', 'CV Ứng tuyển vị trí chăm sóc khách hàng', 'https://static.chotot.com/storage/chotot-kinhnghiem/c2c/2020/06/Mau-cv-xin-viec-file-word-don-gian-2.jpg', true, 4, 5);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (6, '2022-04-25', '2022-04-27', 'CV Ứng tuyển vị trí kế toán', 'https://nhanlucvietnam.sgp1.digitaloceanspaces.com/uploads/images/blog/full/16246053641ijzs-cach-viet-cv-xin-viec-cho-sinh-vien-moi-ra-truong-9-1462x2048.jpeg', true, 5, 8);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (7, '2022-05-05', '2022-05-09', 'CV Ứng tuyển vị trí giảng viên tiếng anh', 'https://images.careerbuilder.vn/content/images/cv-xin-viec-don-gian-careerbuilder-2.jpg', true, 6, 6);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (8, '2022-07-08', '2022-07-30', 'CV Ứng tuyển vị trí giám đốc bộ phận kinh doanh', 'https://mau-cv.com/wp-content/uploads/2022/01/CV-xin-viec-dieu-duong-VN-Budapest.pdf.png', true, 7, 4);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (9, '2022-03-13', '2022-03-23', 'CV Ứng tuyển vị trí nhân viên lễ tân', 'https://marketplace.canva.com/EAE8uFh1qdE/1/0/1236w/canva-%C4%91%C6%A1n-gi%E1%BA%A3n-nh%C3%A2n-vi%C3%AAn-c%C3%B4ng-t%C3%A1c-x%C3%A3-h%E1%BB%99i-s%C6%A1-y%E1%BA%BFu-l%C3%BD-l%E1%BB%8Bch-r1xnyiIoevk.jpg', true, 8, 10);
insert into cv(id, created_at, updated_at, description, image, status, job_id, user_id) VALUE (10, '2022-06-02', '2022-06-17', 'CV Ứng tuyển vị trí Chăm sóc khách hàng', 'https://thegioivieclam.com.vn/wp-content/uploads/2020/11/cv.jpg', true, 10, 7);


select * from job;
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id, status, highlight) value (1, '2022-01-01', '2022-01-02', 'Môi trường làm việc thân thiện, lộ trình thăng tiến rõ ràng, làm từ t2 đến t6', 'Yêu cầu: Tốt nghiệp bằng khá đại học trở lên, tối thiểu 1 năm kinh nghiệm', '2022-03-21', 'Nữ', 'Nhân viên văn phòng', 'Kế Toán Lao Động Tiền Lương', 'Nhân viên Kế toán', 1, 9000000, 1, 1, 1 ,1, 'Thu nhập: 15 -  35 triệu/tháng; Review lương 02 lần/năm;');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id, status, highlight) value (2, '2022-02-11', '2022-02-15', 'làm full time, thời gian làm việc linh hoạt', 'Yêu cầu: Tốt nghiệp C3 trở lên', '2022-09-15', 'Nam Nữ', 'Lao Động chân tay', 'Công nhân Xưởng hóa chất', 'Công nhân', 50, 7000000, 2, 10, 4 ,1, '10-15tr/tháng + % doanh thu (thu nhập từ 15 đến trên 35tr/tháng); Nghỉ 4 ngày/tháng (hoặc lv tự do – chỉ cần đảm bảo doanh số); Lướng tháng 13, đóng bh theo qđ hiện hành , du lịch công ty');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (3, '2022-04-04', '2022-04-17', 'Môi trường sạch sẽ, thân thiện, thời gian làm việc linh hoạt', 'Yêu cầu: Tốt nghiệp đại học kiến trúc khoa đồ họa', '2022-09-22', 'Nam Nữ', 'Thiết kế đồ họa', 'Chuyên Viên Thiết Kế Đồ Họa', 'Nhân viên', 5, 10000000, 3, 12, 2,1, 'Lương cứng: Hấp dẫn, thỏa thuận theo năng lực + Phụ cấp + Thưởng theo hiệu quả theo thành tích + Đầy đủ chế độ; Thời gian làm việc: Từ 8h15 – 17h15 các ngày Từ thứ Hai đến Thứ Sáu, Thứ Bảy nghỉ cách tuần (đi làm các thứ Bảy tuần 1 và 3, nghỉ các thứ Bảy tuần 2 và 4. Đối với Thứ Bảy tuần thứ năm trong tháng đi làm nửa buổi sáng' );
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (4, '2022-04-13', '2022-04-29', 'Phản hồi và tư vấn nhu cầu/thắc mắc của khách hàng liên quan đến sản phẩm/dịch vụ doanh nghiệp cung cấp', 'Yêu cầu: Ưu tiên các bạn có kinh nghiệm trong ngành customer service hoặc dịch vụ', '2022-09-25', 'Nữ', 'Chuyên viên tư vấn, chăm sóc khách hàng', 'Nhân Viên Sale Online ', 'Nhân viên TeleSale', 20, 15000000, 5, 16, 1 ,1, 'Thu nhập hàng tháng từ 30 tới hơn 40 triệu/ tháng; Thưởng hấp dẫn bao gồm: thưởng nóng, thưởng best sale, thưởng tăng tốc theo tuần, tháng, năm');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (5, '2022-04-03', '2022-04-24', 'Tiếp nhận, làm thủ tục và hỗ trợ cho nhân viên mới nhận việc', 'Yêu cầu: Tốt nghiệp Đại học, Cao đẳng chuyên ngành liên quan', '2022-11-30', 'Nam Nữ', 'Nhân viên văn phòng', 'Nhân Viên Hành Chính Nhân Sự', 'Nhân viên phòng hành chính', 7, 11000000, 9, 13, 3 ,1, 'Mức lương cơ bản cạnh tranh: Up to 10TR/tháng + thưởng hoa hồng theo doanh số. Thu nhập 20- 35Tr/Tháng; Chính sách thưởng hấp dẫn: thưởng năm, thưởng khi hoàn thành dự án, thưởng nóng...');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (6, '2022-05-05', '2022-05-26', 'Nhận lớp giảng dạy theo lịch của Phòng Đào tạo và giảng dạy đúng tiến độ, đảm bảo chuẩn theo giáo trình Trung tâm và mục tiêu khoá học.', 'Yêu cầu: Điểm kỹ năng nói đạt từ 6.5 trở lên (IELTS) hoặc tương đương, phát âm chuẩn', '2022-11-01', 'Nữ', 'Giáo viên', 'Giáo Viên Tiếng Anh', 'Giảng viên', 10, 12000000, 8, 15, 5 ,1, 'Thu nhập cố định từ 700$ - 1200$ + thưởng doanh thu hàng tháng, hàng quý, hàng năm; Được hỗ trợ Ipad và các công cụ hiện đại khác trong quá trình làm việc, nhiều khóa đào tạo bổ ích về kỹ năng mềm;');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (7, '2022-05-05', '2022-05-23', 'Nghiên cứu và phát triển thị trường trong lĩnh vực cung ứng nguồn nhân lực trong và ngoài nước', 'Yêu cầu: Tốt nghiệp đại học trở lên chuyên ngành quản trị kinh doanh, Luật, Marketing,', '2022-12-06', 'Nam Nữ', 'Quản lý bộ phận kiêm tìm hiểu thị trường', 'Giám Đốc Kinh Doanh', 'Giám Đốc', 1, 20000000, 9, 17, 6,1, 'Lương từ 15 triệu - 16 triệu trở lên + thưởng theo chế độ của công ty; Thử việc hưởng 100% lương cứng.');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (8, '2022-05-14', '2022-05-20', 'Đón tiếp khách hàng, ứng viên, sắp xếp phòng họp khi cần', 'Yêu cầu: Ngoại hình ưa nhìn , chiều cao từ 1m6 trở lên', '2022-08-04', 'Nữ', 'Tiếp khách hàng', 'Nhân Viên Lễ Tân Hành Chính', 'Nhân viên lễ tân', 3, 8000000, 7, 13, 7 ,1, '12-18 triệu + 35-40% hoa hồng cá nhân + 15% doanh thu nhóm (thu nhập trung bình 50-100 triệu); Thưởng tháng, quý, thưởng ngoại hạng , thưởng phúc lợi dài hạn.');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (9, '2022-05-12', '2022-05-18', 'Coding theo đúng chuẩn coding convention, các quy ước về gitflow, module mà team đã quy định.', 'Yêu cầu: Có tư duy logic tốt, có tinh thần học hỏi, chủ động công việc.', '2022-07-09', 'Nam', 'Code', 'Lập Trình Viên Java - Backend Developer ', 'Nhân viên', 6, 17000000, 6, 5, 8, 1, 'Mức lương: $500 - $1,000 Gross; Đóng BHXH, BHYT, BHTN, thưởng tháng 13, thưởng Project,...');
insert into job(id, created_at, updated_at, description, experience, expired_date, gender, job_type, name, position, recruit_number, salary_range, company_id, job_field_id, location_id,status, highlight) value (10, '2022-06-09', '2022-06-18', 'Quản lý hệ thống và phát triển khách hàng theo data có sẵn.', 'Yêu cầu: Có kinh nghiệm 1 năm bán hàng hoặc quản lý khu vực ở vị trí tương đương', '2022-09-21', 'Nam Nữ', 'Chăm sóc khách hàng', 'Nhân Viên Kinh Doanh', 'Nhân viên', 20, 10000000, 5, 13, 9 , 1, 'Chúng tôi hiện đang thuộc TOP 10 Hệ thống phân phối bất động sản uy tín nhất Việt Nam; Sản phẩm đa dạng với các phân khúc khác nhau cùng với những chủ đầu tư uy tín trong nước và quốc tế: Novaland, Vinpearl, Vinhomes, KN, Osen Fuji,...; Hệ thống đào tạo độc quyền đã giúp cho hàng nghìn nhân sự thành công và phát triển trong suốt 7 năm qua.');


select * from job_field;
insert into job_field(id, created_at, updated_at, name, status) VALUE (1, '2022-11-10', '2022-11-20', 'Kế Toán', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (2, '2022-11-10', '2022-12-13', 'Phụ Hồ', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (3, '2022-11-10', '2022-11-21', 'bán hàng', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (4, '2022-11-10', '2022-10-05', 'Code Back-End', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (5, '2022-11-10', '2022-11-06', 'Code Font-End', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (6, '2022-11-10', '2022-11-11', 'Shipper', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (7, '2022-11-10', '2022-10-07', 'Phụ kho', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (8, '2022-11-10', '2022-10-28', 'Đầu Bếp', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (9, '2022-11-10', '2022-10-24', 'Bảo vệ', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (10, '2022-11-10', '2022-11-24', 'Công nhân', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (11, '2022-01-07', '2022-01-29', 'Kĩ thuật điện điện tử', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (12, '2022-02-10', '2022-02-16', 'Kiến trúc sư', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (13, '2022-04-10', '2022-06-19', 'Giao dịch viên', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (14, '2022-04-22', '2022-05-01', 'Thu Ngân', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (15, '2022-06-10', '2022-07-02', 'Giảng Viên tiếng anh', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (16, '2022-10-18', '2022-10-25', 'Nhân viên teleSale', true);
insert into job_field(id, created_at, updated_at, name, status) VALUE (17, '2022-11-14', '2022-11-22', 'Trưởng phòng kinh doanh', true);

# Bảng địa điểm
select * from location;
insert into location(id, created_at, updated_at, name, status) VALUE (1, '2022-11-10', '2022-11-09', 'Hà Nội', true);
insert into location(id, created_at, updated_at, name, status) VALUE (2, '2022-11-10', '2022-12-13', 'Thành Phố Hồ Chí Minh', true);
insert into location(id, created_at, updated_at, name, status) VALUE (3, '2022-11-10', '2022-12-03', 'Thái Bình', true);
insert into location(id, created_at, updated_at, name, status) VALUE (4, '2022-11-10', '2022-12-06', 'Bắc Ninh', true);
insert into location(id, created_at, updated_at, name, status) VALUE (5, '2022-11-10', '2022-11-28', 'Thái Nguyên', true);
insert into location(id, created_at, updated_at, name, status) VALUE (6, '2022-11-10', '2022-11-22', 'Cần Thơ', true);
insert into location(id, created_at, updated_at, name, status) VALUE (7, '2022-11-10', '2022-12-14', 'Vũng Tàu', true);
insert into location(id, created_at, updated_at, name, status) VALUE (8, '2022-11-10', '2022-12-26', 'Quảng Ninh', true);
insert into location(id, created_at, updated_at, name, status) VALUE (9, '2022-11-10', '2022-11-22', 'Ninh Bình', true);
insert into location(id, created_at, updated_at, name, status) VALUE (10, '2022-11-10', '2022-12-19', 'Hải Phòng', true);

select * from notification;


select * from user;
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (1, '2022-01-05', '2022-01-21', 'https://scontent.fhan17-1.fna.fbcdn.net/v/t1.6435-9/78947578_765069203957624_1820926315138646016_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=Y7WlPc0JQX4AX-O6DlX&tn=1LBugE4nVrg6EHBz&_nc_ht=scontent.fhan17-1.fna&oh=00_AfARE5mLxfNPon4Oh_Uvlf5bq0rr5W5qZOAbTKidPgSkzw&oe=6395312D', true, 'Kiều Anh', '0374.554.144',true, 1 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (2, '2022-02-06', '2022-02-17', 'https://toplist.vn/images/800px/trung-tam-anh-mau-hoang-tram-319533.jpg', false, 'Trần Văn Phương', '0335.113.114',true, 12 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (3, '2022-03-07', '2022-03-29', 'https://toigingiuvedep.vn/wp-content/uploads/2021/07/mau-anh-the-dep-lam-the-can-cuoc.jpg', false, 'Đào Văn Trọng', '0399.999.999',true, 13 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (4, '2022-04-11', '2022-04-16', 'https://i.pinimg.com/736x/e9/ba/cf/e9bacf14768bc4ce2dbc57b003cf10ef.jpg', false, 'Trần Xuân Ba', '0321.167.225',true, 14 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (5, '2022-05-14', '2022-05-18', 'https://toplist.vn/images/800px/tiem-chup-anh-the-lay-ngay-dep-nhat-pleiku-gia-lai-chu-de-da-duoc-nhan-tran-minh-phuong-318152.jpg', false, 'Nguyễn Đức Bình', '0314.164.166',true, 15 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (6, '2022-06-01', '2022-06-22', 'https://alltop.vn/backend/media/images/posts/1012/Studio_MOON-108332.jpg', false, 'Nguyễn Anh Dũng', '0365.978.879',true, 16 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (7, '2022-07-23', '2022-07-27', 'https://haycafe.vn/wp-content/uploads/2021/12/Mau-anh-the-nam.jpg', false, 'Nguyễn Đức Anh', '0334.543.555',true, 17 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (8, '2022-08-27', '2022-08-29', 'https://upload.wikimedia.org/wikipedia/commons/1/10/%E1%BA%A2nh-th%E1%BA%BB-v%C6%B0%E1%BB%A3ng.png', false, 'Trần Xuân Dĩnh', '0323.764.354',true, 18 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (9, '2022-09-08', '2022-09-21', 'http://file.hstatic.net/1000202498/file/cach-chup-anh-the-dep-cho-nam-2_grande.jpg', false, 'Nguyễn Mạnh Hiền', '0387.222.111',true, 19 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (10, '2022-10-05', '2022-10-08', 'https://smilemedia.vn/wp-content/uploads/2022/09/chup-hinh-the-dep-e1664379729855.jpg', false, 'Hoàng Phương Nam', '0374.554.144',true, 20 );
insert into user(id, created_at, updated_at, image, is_admin, name, phone_number, status, account_id) value (11, '2022-11-16', '2022-11-20', 'https://top1quangnam.com/wp-content/uploads/2021/08/unnamed-file-1657.jpg', false, 'Bùi Quang Anh', '0388.888.888',true, 21 );

