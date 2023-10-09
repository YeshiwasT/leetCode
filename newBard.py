# from bardapi import BardCookies

# cookie_dict = {
#     "__Secure-1PSID": "ZwiOh3l5n85_D0Vs7vGWvfblcbyjVYGKGOTbXGfXepaZgWkLB92PnhCtAmpQHVJALBzDVA.",
#     "__Secure-1PAPISID": "KOJnZ1T3dlJ34McE/AB4mpCnU7If-Y6-5w",
#     "__Secure-1PSIDCC": "APoG2W9I4Z0p-3uGJbSUjX73AMcLIWO_FO6z-9B0ZYFm-H4_YOOPjp0QIkVSPvAGCrcKNhXa",

#     # Any cookie values you want to pass session object.
# }

# bard = BardCookies(cookie_dict=cookie_dict)
# input_text = "i gave you text input and I need you to give me json response in json format for the given text  could you extract the job requirement and description and to put it as requirement and description the text is given as follows  'This listing is only for individuals who are looking to work 1 - 2 days on the weekend and 3 - 4 days during the weekdays, for a total of 5 days per week.The role of this Content Creator (Writer) position is to curate, write, edit, and publish original interactive content and stories, using Koreaboo's writing platform. This position requires someone who is extremely talented at writing and creating content thats concise, entertaining and easy to read.Content Writers are tasked with the entire process of creating articles, including brainstorming ideas, to writing the article/content, editing the article/content, and publishing it across multiple platforms. This position requires excellent storytelling, a firm grasp on writing for a wide audience, and disciplined research/curating skills.FULL-TIME, CONTRACT POSITION. 40+ HOURS PER WEEK.Cover Letter Review Process,Please use perfect spelling and grammar when writing answers for the Cover Letter portion of this application. You should attempt to answer the questions in a writing style that feels natural to read.,You do not need to upload or fill in a second 'Cover Letter' in the optional form. "
# response = bard.get_answer(input_text)
# print(response)


def __init__(self):

    headers = {
    "Host": "bard.google.com",
    "X-Same-Domain": "1",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36",
    "Content-Type": "application/x-www-form-urlencoded;charset=UTF-8",
    "Origin": "https://bard.google.com",
    "Referer": "https://bard.google.com/",}
    self._reqid = int("".join(random.choices(string.digits, k=4)))
    self.conversation_id = ""
    self.response_id = ""
    self.choice_id = ""
    self.session = requests.Session()
    self.session.headers = headers
    self.session.cookies.set("__Secure-1PSID", "ZwiOh3l5n85_D0Vs7vGWvfblcbyjVYGKGOTbXGfXepaZgWkLB92PnhCtAmpQHVJALBzDVA.")
    self.SNlM0e = self.__get_snlm0e()
resp = self.session.post(
  "https://bard.google.com/_/BardChatUi/data/assistant.lamda.BardFrontendService/StreamGenerate",
  params=params,
  data=data,
  timeout=120,
)
chat_data = json.loads(resp.content.splitlines()[3])[0][2]
if not chat_data:
  return {"content": f"Google Bard encountered an error: {resp.content}."}
json_chat_data = json.loads(chat_data)
results = {
  "content": json_chat_data[0][0],
  "conversation_id": json_chat_data[1][0],
  "response_id": json_chat_data[1][1],
  "factualityQueries": json_chat_data[3],
  "textQuery": json_chat_data[2][0] if json_chat_data[2] is not None else "",
  "choices": [{"id": i[0], "content": i[1]} for i in json_chat_data[4]],
}
