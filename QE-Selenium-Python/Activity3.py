from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.firefox.service import Service
import time

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

try:
    driver.get("https://training-support.net/webelements/login-form/")
    print(driver.title)
    
    username = wait.until(
        EC.visibility_of_element_located((By.ID, "username"))
    )
    username.send_keys("admin")

    password = driver.find_element(By.ID, "password")
    password.send_keys("password")

    submit = wait.until(
        EC.element_to_be_clickable((By.XPATH, "//button[contains(@class,'svelte')]"))
    )
    submit.click()

    time.sleep(2)

finally:
    driver.quit()
