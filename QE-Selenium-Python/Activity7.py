from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

try:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print("Page Title:", driver.title)

    input_field = driver.find_element(By.CSS_SELECTOR, "input[type='text']")

    print("Input enabled before click:", input_field.is_enabled())

    enable_button = driver.find_element(By.XPATH, "//button[contains(text(),'Enable')]")
    enable_button.click()

    wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "input[type='text']")))

    print("Input enabled after click:", input_field.is_enabled())

finally:
    driver.quit()
