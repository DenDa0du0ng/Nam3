import socket

HOST = "127.0.0.1" #Loopback
SERVER_PORT = 65432
FORMAT = "utf8"

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

print("CLIENT SIDE")
client.connect((HOST, SERVER_PORT))
print("Client address: ", client.getsockname())

psw = input("Password: ")
userName = input("User Name: ")
client.sendall(userName.encode(FORMAT)) #Gửi tên đăng nhập đến máy chủ

client.sendall(psw.encode(FORMAT))#Gửi mật khẩu đến máy chủ 

input()
