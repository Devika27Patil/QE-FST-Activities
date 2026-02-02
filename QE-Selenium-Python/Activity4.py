from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service
import time

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/target-practice")

    print("Page Title:", driver.title)

    third_header = driver.find_element(By.XPATH, "(//h3)[1]")
    print("3rd Header Text:", third_header.text)

    fifth_header = driver.find_element(By.XPATH, "(//h3)[2]")
    print("5th Header Color:", fifth_header.value_of_css_property("color"))

    purple_button = driver.find_element(By.XPATH, "//button[text()='Purple']")
    print("Purple Button Classes:", purple_button.get_attribute("class"))

    slate_button = driver.find_element(By.XPATH, "//button[text()='Slate']")
    print("Slate Button Text:", slate_button.text)

    time.sleep(2)

finally:
    driver.quit()
