# PieChartExample - Quick Start Guide

Welcome to the PieChartExample project! This guide will walk you through the setup process in a simple and easy-to-follow manner. Let's get started!

## Prerequisites
- **VirtualBox**: A free and open-source hosted hypervisor for x86 virtualization.
- **Vagrant**: A tool for building and managing virtual machine environments.
- **Super.Human.Installer**: Essential for setting up your server environment.

## Initial Setup
1. **Install Essential Tools**:
   - Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads), [Vagrant](https://developer.hashicorp.com/vagrant/downloads), and [Super.Human.Installer](https://superhumaninstaller.com/).
2. **Set Up Your Server**:
   - Get Domino 12.0.1 and set up at least one server. Follow the instructions at [Superhumaninstaller.com](https://superhumaninstaller.com/). Note your hostname and organization certifier.

## Development Environment
1. **Install Moonshine IDE & SDK**:
   - Download [Moonshine IDE](https://moonshine-ide.com/) and [Moonshine SDK Installer](https://moonshine-ide.com/download-sdk-installer/).
2. **Prepare Development Tools**:
   - Use the SDK Installer to download Git and the latest Apache Royale nightly version.

## Project Setup
1. **Clone Repository**:
   - In Moonshine IDE, go to `Git -> Manage Repositories` and clone this repository.
   - Import all two projects into your workspace.
2. **Configure PieChartNsf**:
   - Right click PieChartNsf project and go to `Settings/Domino/Target Server` and enter your hostname/certifier.

## Build and Deploy
1. **Build on Vagrant**:
   - With the PieChartNsf project selected, go to `Project -> Build on Vagrant`. Choose the server you set up earlier.
2. **Deploy Domino Database**:
   - Select `Project -> Deploy Domino Database`. Ensure your server is selected. Leave other settings as they are.
3. **Generate Java Agents**:
   - With the PieChartNsf project still selected, go to `Project -> Generate Java Agents` and choose the default directory.
   - Now, select the PieChartNsf_JavaAgents project and go to `Project -> Run on Vagrant`.
4. **Compiling Apache Royale Project**:
   - Build PieChart_Royale locally using the latest Apache Royale.
   - Go to `Project -> Deploy to Vagrant Server` and select your server
   - The default URL for accessing your project is: `https://domino.hostname.certifier.com/PieChartRoyale/js-release/index.html`
5. **Adding Data **
    a. **Editing Data with Notes**:
       - Go to your local Notes client and open Notes application at hostname/certifier. Choose PieChartNsf database.
       - Create new document and add name-value pair. Refresh the browser page and your chnges will be incorporated into the pie chart.
    b. **Import Data from JSON**
        - Select the PieChartNsf project and run Project > Import Documents
        - Browse to `PieChartNsf/data/data.json`
        - Ensure your server is selected and click Submit

And that's it! You've successfully set up the PieChartExample project. If you encounter any issues, please refer to our detailed documentation or reach out to the [community](https://moonshine-ide.topicbox.com/groups/ide) for support. Happy coding!
