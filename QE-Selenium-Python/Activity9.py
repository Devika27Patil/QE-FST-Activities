from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

driver = webdriver.Firefox()

driver.get("https://training-support.net/webelements/keyboard-events")

print("Page Title:", driver.title)

driver.find_element(By.TAG_NAME, "body").click()

actions = ActionChains(driver)
actions.send_keys("Hello from Selenium").perform()

time.sleep(5)

print("Text Typed: Hello from Selenium")

driver.quit()
