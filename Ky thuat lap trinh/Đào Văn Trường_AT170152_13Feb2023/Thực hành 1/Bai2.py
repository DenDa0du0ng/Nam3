#Thêm thư viện socket vào chương trình
import socket

#Khai báo đại chỉ IP của máy 
IP = input("Nhập địa chỉ IP bạn muốn kiểm tra DV: ")
#Thêm danh sách địa chỉ port của một số dịch vụ 
Port = input("Nhập tên cổng DV bạn muốn kiểm tra: ")

PORT_LIST = Port.split(",")
#Khai vòng for để chương trình hiểu chạy lần lượt từng cổng port dịch vụ trong danh sách PORT_LIST bên trên
for PORT in PORT_LIST:
    PORT = int(PORT)
    #Khởi tạo đối tượng socket với giao thức là TCP
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    #Câu lệnh sẽ kết nối với địa chỉ IP và sẽ trả kết quả xem có kết nối được hay không đối với từng cổng
    result = s.connect_ex((IP, PORT))

    #Hàm if else bên dưới để nếu kết nối được thì sẽ trả về tb để biết nó kết nối chưa 
    if result == 0:
        print("Connected successfully")
    else:
        print("Could not connect")
    print(PORT,":",result)
    #Kết thúc chương trình 
    s.close()

