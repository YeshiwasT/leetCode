from bardapi import Bard
import os
import requests
# import bardapi
# bard = Bard()
# # Replace 'your_username' and 'your_password' with actual credentials
# bard.authenticate(username='yeshiwastikimu0@gmail.com', password='longlivebrkty#1')

# session = requests.Session()

# # Send an HTTP GET request to the website
# url = "https://bard.google.com/faq"
# response = session.get(url)
# print(response)
# if response.status_code == 200:
#     # Loop through the cookies and find the one with the name "__Secure-1PSID"
#     secure_1psid_cookie = None
#     print(session.cookies)
#     for cookie in session.cookies:
#         print(cookie.name)
#         if cookie.name == "__Secure-1PSID":
#             secure_1psid_cookie = cookie.value
#             break
#     print(secure_1psid_cookie)
#     if secure_1psid_cookie:
#         print(f"Value of __Secure-1PSID cookie: {secure_1psid_cookie}")
#     else:
#         print("__Secure-1PSID cookie not found in the session's cookies.")
# else:
#     print(f"Failed to retrieve the webpage. Status code: {response.status_code}")# set your __Secure-1PSID value to key

token = 'agiOh6cnqCwY0AC-pZpqCTh9xkjSBxpvCj5dYm6-IMAfosZq2IyktJLgXXn3goKQ2xAX1A.'

# set your input text
input_text = "i gave you text input and I need you to give me json response for the given text  could you extract the job requirement and description and to put it as requirement and description the text is given as follows  'This listing is only for individuals who are looking to work 1 - 2 days on the weekend and 3 - 4 days during the weekdays, for a total of 5 days per week.The role of this Content Creator (Writer) position is to curate, write, edit, and publish original interactive content and stories, using Koreaboo's writing platform. This position requires someone who is extremely talented at writing and creating content thats concise, entertaining and easy to read.Content Writers are tasked with the entire process of creating articles, including brainstorming ideas, to writing the article/content, editing the article/content, and publishing it across multiple platforms. This position requires excellent storytelling, a firm grasp on writing for a wide audience, and disciplined research/curating skills.FULL-TIME, CONTRACT POSITION. 40+ HOURS PER WEEK.Cover Letter Review Process,Please use perfect spelling and grammar when writing answers for the Cover Letter portion of this application. You should attempt to answer the questions in a writing style that feels natural to read.,You do not need to upload or fill in a second 'Cover Letter' in the optional form. "

# Send an API request and get a response.
response = bardapi.core.Bard(token).get_answer(input_text)
print(response)