import json
import codecs
def text_to_json(text_file):
  # Open text file and read contents
  with codecs.open("data.txt",'r', encoding='utf-8') as f:
    text = f.read()

  # Parse text into a Python dictionary  
  data = {}

  # Split text on newlines into list of lines
  lines = text.split("\n")
  arr=[]
  n=22
  kk=[]

  # Process each line 
  for line in range(n):
        kk.append(lines[n+line])
        data["id"] = 304+line
        data["yemsa"] = lines[line]
        data["amharic"] = str(lines[n+line])
        data["english"] = lines[2*(n)+line]
        data["audioUrl"] = "https://firebasestorage.googleapis.com/v0/b/yemsa-dictionary.appspot.com/o/audio%2F2023_07_12_00_03_53.mp3?alt=media&token=49b102fe-9ac5-47be-87ce-2f5cdeb219f3"
        data["example"] = {
            "examYema":[
             "han canna elidiffar"
            ],
            "examAmharic":[
             "ይሄ ዉሻ እየሮጠ ነዉ::"       
            ],
             "examEnglish":
             [
              "This dog is running"
             ] }
    # Split line on delimiter (comma, tab, etc) 
    #fields = line.split(",")  

    # Add each field to dictionary
        arr.append(data)
        data={}
  # Convert dictionary to JSON string
  json_string = json.dumps(arr,ensure_ascii=False, indent=2)

  return json_string

# Test it
text_file = "data.txt"
json_data = text_to_json(text_file)
print(json_data)