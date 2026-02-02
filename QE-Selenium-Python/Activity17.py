from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
import time

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/selects")
    print("Page Title:", driver.title)

    multi_select = driver.find_element(By.XPATH, "//select[@multiple]")
    select = Select(multi_select)

    if select.is_multiple:
        print("Multi-select dropdown detected")

    select.select_by_visible_text("HTML")

    select.select_by_index(3)  # Node
    select.select_by_index(4)  # React
    select.select_by_index(5)  # Angular

    select.select_by_value("nodejs")

    time.sleep(2)

    select.deselect_by_index(4)

    time.sleep(2)

finally:
    driver.quit()
