from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

try:
    driver.get("https://training-support.net/webelements/alerts")

    print("Page Title:", driver.title)

    simple_alert_btn = wait.until(
        EC.element_to_be_clickable(
            (By.XPATH, "//button[contains(text(),'Simple')]")
        )
    )
    simple_alert_btn.click()

    alert = wait.until(EC.alert_is_present())

    print("Alert Text:", alert.text)

    alert.accept()

finally:
    driver.quit()
