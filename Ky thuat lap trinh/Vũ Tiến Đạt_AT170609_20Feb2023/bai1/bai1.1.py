
# API KEY: n4gHR6fOhxpCkoZcrgs6fUosfN3p7XUe
import requests

# import os
# SHODAN_API_KEY = os.environ['n4gHR6fOhxpCkoZcrgs6fUosfN3p7XUe']
# print(SHODAN_API_KEY)
SHODAN_API_KEY = 'n4gHR6fOhxpCkoZcrgs6fUosfN3p7XUe'
#ip google.com
ip = '142.250.204.78'


def ShodanInfo(ip):
    try:
        # gửi một yêu cầu GET đến địa chỉ API của Shodan để lấy thông tin về địa chỉ IP đã chỉ định và API key. 
        result = requests.get(f"https://api.shodan.io/shodan/host/{ip}?key={SHODAN_API_KEY}&minify=rue").json()
    except Exception as exception:
        # Nếu có lỗi xảy ra, một từ điển với thông báo lỗi sẽ được trả về.
        result = {'error': 'Informational not available'}
    return result

print(ShodanInfo(ip))