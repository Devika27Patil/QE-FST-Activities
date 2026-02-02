from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 15)

driver.get("https://training-support.net/webelements/dynamic-content")

print("Page Title:", driver.title)

click_me_btn = driver.find_element(
    By.XPATH, "//button[contains(text(),'Click me')]"
)
click_me_btn.click()

message = wait.until(
    EC.visibility_of_element_located(
        (By.XPATH, "//*[contains(text(),'release')]")
    )
)

print("Message displayed:", message.text)

driver.quit()
