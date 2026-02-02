# from selenium.webdriver.common.by import By
# from selenium import webdriver

# with webdriver.Firefox() as driver:
#     driver.get("https://training-support.net/webelements/login-form/")

#     print(driver.title)

#     element = driver.find_element(By.CSS_SELECTOR, "#username")
#     element.send_keys("admin")

#     password = driver.find_element(By.CSS_SELECTOR, "#password")
#     password.send_keys("password")

#     submit = driver.find_element(By.CSS_SELECTOR, "button[type='submit']")
#     submit.click()

#     driver.quit()

from selenium.webdriver.common.by import By
from selenium import webdriver
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print(driver.title)
    element =driver.find_element(By.XPATH,"//*[@id='username']")
    element.send_keys("devika")
    password=driver.find_element(By.ID,"password")
    password.send_keys("devika27")
    submit=driver.find_element(By.TAG_NAME,"button")
    submit.click()


