from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/tables")

print("Page Title:", driver.title)

rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
print("No of rows:", len(rows))

colunms = driver.find_elements(By.XPATH, "//table/thead/tr/th")
print("No of columns:", len(colunms))

third_row = driver.find_elements(By.XPATH, "//table/tbody/tr[3]/td")

print("Third row data:")
for cell in third_row:
    print(cell.text)

cell_val = driver.find_element(By.XPATH, "//table/tbody/tr[2]/td[2]")
print("2nd row, 2nd column data:", cell_val.text)

driver.quit()