import requests

logins = []

# đọc file 
with open("D:\chuyennganh/nam3\ky2\kythuatlaptrinh\BtTuan20-2\Bai3\login.txt", "r") as filehandler:
    for line in filehandler:
        # Remove all \n of each line 
        login = line[:-1]
        logins.append(login)
    #print (logins)

domain = "http://qldt.actvn.edu.vn"
subDomain = "/CMCSoft.IU.Web.info"

#Kiểm tra đăng nhập với từng tài khoản 
for login in logins:
    print("Checking..." + domain + subDomain +  login)
    #thực hiện yêu cầu GET đến URL đăng nhập
    response = requests.get(domain + subDomain + login )
    print(response)
    #. Nếu trang web phản hồi với mã trạng thái HTTP là 200 (tức là trang web đăng nhập được tìm thấy)
    if response.status_code == 200:
        print("Login resource detected: " + login)
        break