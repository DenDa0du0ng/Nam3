#!/usr/bin/python
# Mô đun json : ử dụng để import thư viện JSON trong Python.
# Thư viện JSON cho phép mã hóa và giải mã các định dạng dữ liệu JSON
# mô đun urllib.request cung cấp các công cụ để mở các URL (địa chỉ web)
# và truy xuất dữ liệu từ chúng...
import json
import urllib.request


def show_informaintion(url):
    # trong quá trình có thể văng ra ngoại lệ của  json.loads()
    # không thể chuyển đổi dữ liệu JSON từ bytes sang đối tượng Python
    try:
        # quá trình chuyển đổi không thành công, hàm json.loads() sẽ ném ra một lỗi

        # urlopen() : mở kết nối tới URL của trang PyPI
        # trả về 1 response
        response = urllib.request.urlopen(url)
        # lấy nội dung của response, ta gọi phương thức read() của đối tượng response,
        # trả về dữ liệu dạng bytes
        # sử dụng hàm json.loads() để chuyển đổi dữ liệu JSON từ bytes sang đối tượng Python

        data = json.loads(response.read().decode())  # data là 1 kiểu : dictionary

        # Lấy thông tin phiên bản, giấy phép, thông tin bản quyền, tác giả, email tác giả
        version = data['info']['version']
        license = data['info']['license']
        copyright = data['info']['license']
        author = data['info']['author']
        author_email = data['info']['author_email']

        # Lấy URL tài liệu, tiêu đề và mô tả
        project_url = data['info']['project_urls']['Documentation']
        summary = data['info']['summary']
        description = data['info']['description']

        # hiển thị thông qua hàm print()
        print("Phiên bản: ", version)
        print("Giấy phép: ", license)
        print("Thông tin bản quyền: ", copyright)
        print("Tác giả: ", author)
        print("Email tác giả: ", author_email)
        print("URL tài liệu: ", project_url)
        print("Tiêu đề: ", summary)
        print("Mô tả: ", description)
    except json.decoder.JSONDecodeError:  # lỗi
        print("Lỗi chuyển đổi dữ liệu JSON")  # thông báo
        return  # kết thúc


if __name__ == '__main__':
    url = "https://pypi.org/pypi/requests/json"  # url chứa thoing tin phân bản ,giấy phép .
    show_informaintion(url)
