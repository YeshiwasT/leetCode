from bardapi import Bard
import re
import json
bard = Bard(token_from_browser=True)
input_t="Extract JSON format data from the given job requirement and job description text: This listing is only for individuals who are looking to work 1 - 2 days on the weekend and 3 - 4 days during the weekdays, for a total of 5 days per week.The role of this Content Creator (Writer) position is to curate, write, edit, and publish original interactive content and stories, using Koreaboo's writing platform. This position requires someone who is extremely talented at writing and creating content thats concise, entertaining and easy to read.Content Writers are tasked with the entire process of creating articles, including brainstorming ideas, to writing the article/content, editing the article/content, and publishing it across multiple platforms. This position requires excellent storytelling, a firm grasp on writing for a wide audience, and disciplined research/curating skills.FULL-TIME, CONTRACT POSITION. 40+ HOURS PER WEEK.Cover Letter Review Process,Please use perfect spelling and grammar when writing answers for the Cover Letter portion of this application. You should attempt to answer the questions in a writing style that feels natural to read.,You do not need to upload or fill in a second Cover Letter in the optional form."
# input_text = "i gave you text input and I need you to give me json response for the given text  could you extract the job requirement and description and to put it as requirement and description the text is given as follows  'This listing is only for individuals who are looking to work 1 - 2 days on the weekend and 3 - 4 days during the weekdays, for a total of 5 days per week.The role of this Content Creator (Writer) position is to curate, write, edit, and publish original interactive content and stories, using Koreaboo's writing platform. This position requires someone who is extremely talented at writing and creating content thats concise, entertaining and easy to read.Content Writers are tasked with the entire process of creating articles, including brainstorming ideas, to writing the article/content, editing the article/content, and publishing it across multiple platforms. This position requires excellent storytelling, a firm grasp on writing for a wide audience, and disciplined research/curating skills.FULL-TIME, CONTRACT POSITION. 40+ HOURS PER WEEK.Cover Letter Review Process,Please use perfect spelling and grammar when writing answers for the Cover Letter portion of this application. You should attempt to answer the questions in a writing style that feels natural to read.,You do not need to upload or fill in a second 'Cover Letter' in the optional form. "
res =input_t
try:
  res = bard.get_answer(input_t)
except Exception as e:
  print(e)
  bard = bard.refresh_session()
  res = bard.get_answer(input_t)
print(res)
input_text=res["content"]
# print(input_text)
# Parse the extracted JSON
start_index = input_text.find('json') + len('json')
end_index = input_text.find('```', start_index)

if start_index != -1 and end_index != -1:
    json_data = input_text[start_index:end_index].strip()
    try:
        parsed_json = json.loads(json_data)
        # print("Extracted JSON:")
        print(json.dumps(parsed_json, indent=4))
    except json.JSONDecodeError:
        print("JSON extraction failed. Invalid JSON detected.")
else:
    print("No JSON data found in the text.")
