from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
wait = WebDriverWait(driver, 15)

driver.get("https://training-support.net/webelements/tables")

print("Page Title:", driver.title)

rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
print("No of rows:", len(rows))

columns = driver.find_elements(By.XPATH, "//table/thead/tr/th")
print("No of columns:", len(columns))

book_before = driver.find_element(
    By.XPATH, "//table/tbody/tr[5]/td[2]"
).text
print("Book name in 5th row before sorting:", book_before)

price_header = driver.find_element(
    By.XPATH, "//table/thead/tr/th[5]"
)
price_header.click()

wait.until(
    lambda driver: driver.find_element(
        By.XPATH, "//table/tbody/tr[5]/td[2]"
    ).text != book_before)

book_after = driver.find_element(
    By.XPATH, "//table/tbody/tr[5]/td[2]"
).text
print("Book name in 5th row after sorting:", book_after)

driver.quit()
