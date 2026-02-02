from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print("Page Title:", driver.title)

    checkbox = driver.find_element(By.CSS_SELECTOR, "input[type='checkbox']")

    print("Checkbox selected before click:", checkbox.is_selected())

    checkbox.click()

    print("Checkbox selected after click:", checkbox.is_selected())

finally:
    driver.quit()
