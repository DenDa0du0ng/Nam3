import shodan
import re
import os

servers = []
SHODAN_API_KEY = 'n4gHR6fOhxpCkoZcrgs6fUosfN3p7XUe'
shodan_api = shodan.Shodan(SHODAN_API_KEY)
# trả về là một danh sách các kết quả, mỗi kết quả chứa thông tin về một máy chủ thỏa mãn
results = shodan_api.search('port: 21 Anonymous user logged in')
# số lượng máy chủ tìm thấy
print ("hosts number: " +str(len(results['matches'])))
#được sử dụng để duyệt qua từng kết quả của tìm kiếm và thêm địa chỉ IP của máy chủ vào danh sách,
# nếu dịa chỉ Ip khả dụng thì add vào mảng
for result in results['matches']:
    if result['ip_str'] is not None:
        servers.append(result['ip_str'])
for server in servers:
    print (server)