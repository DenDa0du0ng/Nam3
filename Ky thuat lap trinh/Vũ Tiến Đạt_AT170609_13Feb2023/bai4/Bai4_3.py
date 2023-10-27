import urllib.request

url = input("Nhap dia chi mien cua Web: ") #Nhập URL mà chúng ta muốn thực hiện yêu cầu
response = urllib.request.urlopen(url)#Gửi yêu cầu đến URL và nhận được response trả về 

print("Status code: ", response.status)#In ra trạng thái của HTTP
print("Các thuộc tính và phương thức của đối tượng phản hồi:")
print(dir(response)) #In ra tất cả thuộc tính và phương thức có sắn đối tượng response 