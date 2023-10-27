import urllib.request

from urllib.request import Request
url = "https://www.google.com/" #Địa chỉ URL của trang web sẽ được yêu cầu thông qua module urllib.request.
USER_AGENT = 'Mozilla/5.0 (Linux; Android 5.1.1) AppleWebKit/537.36' #một chuỗi ký tự đại diện cho trình duyệt web của người dùng

def chorm_user_agent():
    opener = urllib.request.build_opener() #Mở một HTTP handler để gửi yêu cầu đến server.
    opener.addheaders = [('User-agent', USER_AGENT)] #Thêm header User-Agent vào trong yêu cầu được gửi đến server.
    #Đặt opener hiện tại để mở URL thông qua build_opener()
    urllib.request.install_opener(opener) 
    response = urllib.request.urlopen(url)#Gửi yêu cầu đến địa chỉ url và lấy response trả về.
    print("Response headers")
    print("---------------------------")
    # Lặp qua tất cả các headers trả về trong response và in ra thông tin của chúng.
    for header, value in response.getheaders(): 
        print(header+":"+value)
    request = Request(url) #Tạo một yêu cầu Request với địa chỉ url trên
    request.add_header("User-agent", USER_AGENT) #Thêm header User-Agent vào trong yêu cầu Request.
    print("\nRequest headers")
    print("-------------------------------")
    #Lặp qua tất cả các headers trong yêu cầu Request và in ra thông tin của chúng.
    for header, value in request.header_items():
        print(header+":"+value)
if __name__ =="__main__": #Kiểm tra xem module đang được thực thi hay được import vào module khác.
    chorm_user_agent() #Gọi hàm chorm_user_agent() để thực thi đoạn code.