import socket

try:
    #Trả về thông tin máy chủ đang chạy chương trình
    print("gethostname: ", socket.gethostname())
    #truy vấn IP của Trang www.actvn.edu.vn
    print("gethostbyname: ", socket.gethostbyname('www.actvn.edu.vn'))
    #Truy vấn host name, bản ghi, các ip khác
    print("gethostbyname_ex: ", socket.gethostbyname_ex('www.actvn.edu.vn'))
    #Truy vấn tên miền, ds các miền khác, ds các địa chỉ ip của miền
    print("gethostbyaddr: ", socket.gethostbyaddr('103.21.148.154'))
    #Lấy tên miền đầy đủ
    print("getfqdn: ", socket.getfqdn('www.actvn.edu.vn'))
    #sử dụng để lấy thông tin đại chỉ IP của miền.
    print("getaddrinfo: ", socket.getaddrinfo('www.actvn.edu.vn', None, 0, socket.SOCK_STREAM))
except socket.error as error:
    print(str(error))
    print("Connection error")