from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 15)

driver.get("https://training-support.net/webelements/dynamic-attributes")

print("Page Title:", driver.title)

full_name = driver.find_element(
    By.XPATH, "//input[starts-with(@id,'full-name')]"
)

email = driver.find_element(
    By.CSS_SELECTOR, "input[id$='email']"
)

event_date = driver.find_element(
    By.XPATH, "//input[contains(@name,'event-date')]"
)

details = driver.find_element(
    By.XPATH, "//textarea[contains(@id,'additional-details')]"
)

full_name.send_keys("Ritesh")
email.send_keys("abc@xyz.com")
event_date.send_keys("2026-02-15")
details.send_keys("Party time!")

driver.find_element(
    By.XPATH, "//button[text()='Submit']"
).click()

wait.until(
    EC.visibility_of_element_located(
        (By.ID, "action-confirmation")
    )
)

message = driver.find_element(By.ID, "action-confirmation").text
print("Message:", message)

driver.quit()
