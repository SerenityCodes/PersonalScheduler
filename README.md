⚠️README is a work in progress. More to come⚠️
# PersonalScheduler

PersonalScheduler is a small virtual assistant based on [LocalAI]("https://github.com/mudler/LocalAGI") that you can self host and run locally on your machine.

## Motivation
There does not exist solutions to self host your own AI scheduler. Apps like reclaim.ai are great, but they are proprietary. Another project attempting to fill this gap is (Atomic)[https://github.com/rush86999/atomic]. However, they have seemed to stalled on the project and most of the backend code is closed source.

## Intent

Project Goals:
- A smart AI scheduler that has a simple interface (Chatbot interface)
- An interface for any calendar provider to be implemented (Google Calendar, Outlook, Nextcloud, etc...)
- Easy setup and management with containers

## 🚀 Features

- 🧠 LLM for intent detection
- 🧠 Uses functions for actions
    - 📝 Write to long-term memory
    - 📖 Read from long-term memory 
    - 🌐 Internet access for search
    - :card_file_box: Write files
    - 🔌 Plan steps to achieve a goal
- 🗨️ Conversational
- Uses Optaplanner REST service to optimize the schedule.
