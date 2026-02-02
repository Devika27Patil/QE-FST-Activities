from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/drag-drop")

print("Page Title:", driver.title)

ball = driver.find_element(By.XPATH, "//*[@id='ball']")
dropzone1 = driver.find_element(By.XPATH, "//div[@id='dropzone1']/span")
dropzone2 = driver.find_element(By.XPATH, "//div[@id='dropzone2']/span")

actions = ActionChains(driver)

actions.drag_and_drop(ball, dropzone1).perform()
time.sleep(2)
print("After Dropzone 1:", dropzone1.text)

actions.drag_and_drop(ball, dropzone2).perform()
time.sleep(2)
print("After Dropzone 2:", dropzone2.text)

driver.quit()
