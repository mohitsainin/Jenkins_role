def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'it.mohitsaini@gmail.com'
          slackSend channel: 'jenkin_project', message: 'successfull '
    }
}
