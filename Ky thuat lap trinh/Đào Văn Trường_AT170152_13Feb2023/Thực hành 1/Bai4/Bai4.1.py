import requests

# Khai báo đường dẫn
url = "https://www.google.com"

# Gửi http get request đến url
req = requests.get(url)

# Lưu trữ các thuộc tính được trả về từ req
res_header = req.headers

# In các thuộc tính 
print(res_header)

# In ra status của request
print("Http status: {}".format(req.status_code))