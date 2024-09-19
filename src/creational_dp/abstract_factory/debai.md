Thiết kế hệ thống sản xuất xe ô tô sử dụng **Abstract Factory**. Hệ thống này cần hỗ trợ sản xuất các dòng xe ô tô khác nhau như **Xe Sedan**, **Xe SUV**, và **Xe điện**. Mỗi dòng xe sẽ có các phiên bản khác nhau tuỳ thuộc vào khu vực sản xuất như Châu Âu và Châu Á. Ngoài ra, các dòng xe này sẽ khác nhau về đặc điểm như động cơ, ghế ngồi và kích thước.


***Yêu cầu***
1. Sử dụng **Abstract Factory** để tạo ra các dòng xe khác nhau (Sedan, SUV, Electric) cho hai khu vực sản xuất **Châu Âu** và **Châu Á**
2. Mỗi dòng xe cần cần có những đặc điểm khác nhau như **Engine** (Động cơ), **Seat** (Ghế ngồi), và **Size** (Kích thước).
3. Tạo các nhà máy sản xuất xe tương ứng với khu vực sản xuất, ví dụ: **EuropeanCarFactory** và **AsianCarFactory**.
4. Hệ thống cần có khả năng dễ dàng mở rộng để hỗ trợ các khu vực sản xuất hoặc các dòng xe mới.
