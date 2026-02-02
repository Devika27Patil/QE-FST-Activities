from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
import time

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/selects")
    print("Page Title:", driver.title)

    dropdown = driver.find_element(By.XPATH, "//select")

    select = Select(dropdown)

    select.select_by_visible_text("Two")

    select.select_by_index(3)   # Four

    select.select_by_value("five")

    print("Dropdown options:")
    options = select.options

    for option in options:
        print(option.text)

    time.sleep(3)

finally:
    driver.quit()
