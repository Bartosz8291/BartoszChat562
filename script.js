document.getElementById('send-button').addEventListener('click', function() {
    var message = document.getElementById('message-input').value;
    if (message.trim() !== '') {
        var chatLog = document.getElementById('chat-log');
        chatLog.innerHTML += '<div>' + message + '</div>';
        document.getElementById('message-input').value = '';
        chatLog.scrollTop = chatLog.scrollHeight;
    }
});
