Bạn được yêu cầu thiết kế một hệ thống quản lý hồ sơ bệnh nhân sử dụng Singleton Pattern. Hệ thống phải đảm bảo rằng có một nơi lưu trữ và quản lý tất cả hồ sơ bệnh nhân duy nhất trên hệ thống. Điều này giúp duy trì tính nhất quán và tránh trùng lặp hoặc mất dữ liệu khi các bác sĩ hoặc nhân viên y tế truy cập vào hồ sơ của bệnh nhân.

**Yêu cầu:**
1. Sử dụng Singleton Pattern để thiết kế lớp quản lý hồ sơ bệnh nhân, đảm bảo chỉ có một thể hiện của hệ thống quản lý này.
2. Cung cấp các phương thức để thêm mới, cập nhật và truy vấn hồ sơ bệnh nhân.
3. Hệ thống cần hỗ trợ truy cập thông tin bệnh nhân từ nhiều nơi khác nhau (ví dụ: từ bác sĩ, y tá, nhân viên hành chính) nhưng vẫn đảm bảo tính nhất quán của dữ liệu.