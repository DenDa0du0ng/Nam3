import nmap
nmap_path = [r"C:\Program Files (x86)\Nmap\nmap.exe",]
 
class NmapScaner:
    #ể khởi tạo một đối tượng portScanner của lớp nmap.PortScanner
    def __init__(self):
        self.portScanner =nmap.PortScanner(nmap_search_path=nmap_path)

    #với mỗi cổng trong danh sách "ports",quét cổng đó trên địa chỉ IP được nhập
    def nmapScan(self, ip_address, port):
        self.portScanner.scan(ip_address, port)
         #In ra màn hình kết quả quét công đó + comman line được sử dụng để quét.
        print("[+] Executing command: ", self.portScanner.command_line())
        
def main():
    ip_address = input("IP scan: ")
    ports = ["21", "22", "23", "24", "25", "80", "443"]
    for port in ports:
        NmapScaner().nmapScan(ip_address, port)  #quét các cổng địa chỉ

if __name__ == "__main__":
    main()