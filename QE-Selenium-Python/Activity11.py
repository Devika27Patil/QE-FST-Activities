from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

checkbox = driver.find_element(By.XPATH, "//input[@type='checkbox']")

toggle_btn = driver.find_element(
    By.XPATH, "//button[contains(text(),'Toggle Checkbox')]"
)

toggle_btn.click()

wait.until(
    EC.invisibility_of_element_located(
        (By.XPATH, "//input[@type='checkbox']")
    )
)
print("Checkbox disappeared")

toggle_btn.click()

checkbox = wait.until(
    EC.presence_of_element_located(
        (By.XPATH, "//input[@type='checkbox']")
    )
)

checkbox.click()
print("Checkbox selected")

driver.quit()
