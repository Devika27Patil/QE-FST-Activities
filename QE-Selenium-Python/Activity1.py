from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

driver.get("https://training-support.net")

print("Home Page Title :", driver.title)

about_us = driver.find_element(By.LINK_TEXT, "About Us")
about_us.click()

print("About Us Page Title :", driver.title)

driver.quit()