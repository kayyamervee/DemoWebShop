# Agile Software Testing Project - DemoWebShop

### * This project is for educational purposes and is intended to help participants test their own skills.

This project provides a comprehensive user management system for a web store, encompassing features such as user registration, login/logout functionality, order placement, survey responses, and order history downloads.

## Table of Contents
## Overview
## Features
#### 1.User Registration - (US_201)
#### 2.Negative User Registration - (US_202)
#### 3.Logout - (US_203)
#### 4.Login - (US_204)
#### 5.Negative Login Scenarios - (US_205)
#### 6.Order Placement - (US_206)
#### 7.Survey Response - (US_207)
#### 8.Negative Coupon and Gift Card Usage - (US_208)
#### 9.Download Order History - (US_209)
## Test Environment
## Technologies and Tools
## Running the Tests
## Contributors

## Overview

This project aims to enhance the shopping experience by providing a user-friendly interface for managing user accounts and transactions on a web store. The following sections detail the key functionalities and scenarios supported by this system.

## Features

### 1.User Registration - (US_201)

This feature allows users to create an account on the web store.

**Requirements:**

**1.** Click on the "Register" button.

**2.** Fill in the required fields: First Name, Last Name, Gender, Email, Password, and Password Confirmation.

**3.** Submit the registration form.
   
### 2.Negative User Registration - (US_202)

Ensures that users cannot register with an email address that is already in use.

**Requirements:**

Attempt to register with an existing email address.

### 3.Logout - (US_203)

Enables users to log out of their accounts securely.

**Requirements:**

Perform the logout action from the user account.

### 4.Login - (US_204)

Allows users to access their accounts by entering valid credentials.

**Requirements:**

**1.** Click on the "Login" button.

**2.** Enter a valid email and password.

### 5.Negative Login Scenarios - (US_205)

Tests various scenarios to ensure robust security during the login process.

**Requirements:**

Attempt login with empty fields or incorrect credentials.

### 6.Order Placement - (US_206)

Facilitates the purchasing process by allowing users to place orders using credit cards.

**Requirements:**

**1.** Select a product and add it to the cart.

**2.** Provide shipping information and agree to terms.

**3.** Complete the payment process.

### 7.Survey Response - (US_207)

Enables users to participate in surveys to provide feedback on their shopping experience.

**Requirements:**

Access the survey section and select a response option.

### 8.Negative Coupon and Gift Card Usage - (US_208)

Checks how the system handles situations where no coupons or gift cards are available during checkout.

**Requirements:**

Attempt to apply a coupon or gift card that does not exist.

### 9.Download Order History - (US_209)

Allows users to view and download invoices for their past orders.

**Requirements:**

Log into the user account and navigate to the order history section.

## Test Environment

**1.**	The testing will be conducted on https://demowebshop.tricentis.com/.

**2.**	Supported browsers include Chrome, Safari, and Firefox.

**3.**	Ensure internet connectivity is available during testing.

## Technologies and Tools

**1. Programming Language :** Java

**2. Test Automation Tools :** Selenium WebDriver

**3. Version Control System :** Git and GitHub

**4. Test Management :** JIRA & Zephyr Scale

## Running the Tests

**1.** Clone the repository:
git clone https://github.com/kayyamervee/DemoWebShop.git

**2.** Install any necessary dependencies. This step may vary based on project specifications.

**3.** Follow the outlined steps in the test environment to execute the tests.

 ## Contributors
 
 | Contributor                                               | Role                                  |
|-----------------------------------------------------------|---------------------------------------|
| [Merve Kaya](https://github.com/kayyamervee)              | Project Lead & QA Automation Engineer |
| [Ümmühan Teke](https://github.com/UmmuhanTeke)            | QA Automation Engineer                |
| [Sefa Kahraman](https://github.com/SefaKahramann)         | QA Automation Engineer                |
| [Abdulkerim Mutlu](https://github.com/AbdulkerimMutlu)    | QA Automation Engineer                |
| [Songül Çam](https://github.com/songulcam)                | QA Automation Engineer                |


