from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 10)

try:
    driver.get("https://training-support.net/webelements/dynamic-controls")

    print("Page Title:", driver.title)

    checkbox = driver.find_element(By.ID, "checkbox")
    
    print("Checkbox displayed before remove:", checkbox.is_displayed())

    remove_button = driver.find_element(By.XPATH, "//button[contains(text(),'Remove')]")
    remove_button.click()

    wait.until(EC.invisibility_of_element(checkbox))

    print("Checkbox displayed after remove:", checkbox.is_displayed())

except Exception:
    print("Checkbox is not displayed after removal.")

finally:
    driver.quit()
