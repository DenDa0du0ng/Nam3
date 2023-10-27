from selenium.webdriver.edge.service import Service
from selenium import webdriver

service = Service(executable_path="/path/to/edgedriver")
driver = webdriver.Edge(service=service)