#Thêm thư viện socket vào chương trình
import socket

HOST = "127.0.0.1" #Loopback
SERVER_PORT = 65432
FORMAT = "utf8"

 #Khởi tạo đối tượng socket với giao thức là TCP
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

#Mở kết nối từ máy khách đến máy chủ 
s.bind((HOST, SERVER_PORT))

s.listen()

print("SERVER SIDE")
print("Server: ",HOST, SERVER_PORT)
print("Wating for Client")

conn, addr = s.accept() #dòng lệnh này chấp nhận kết nối đến từ client

print("Client address: ",addr)
print("conn: ", conn.getsockname())

userName = conn.recv(1024).decode(FORMAT)#Nhận thông tin tên đăng nhập của máy client

psw = conn.recv(1024).decode(FORMAT) #Nhận thông tin mật khẩu của máy client
print("User name: ", userName) #In ra tên tài khoản
print("Password: ", psw)  #In ra mật khẩu

input()