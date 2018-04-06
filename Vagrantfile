# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

	config.vm.box = "chad-thompson-VAGRANTSLASH-ubuntu-trusty64-gui"
	#config.vm.network "public_network", ip: "192.168.1.28"
	config.vm.synced_folder "shared", "/tmp/shared"
	config.vm.provision "shell", path: "testFile.sh"
	#config.vm.hostname = "machineDG.gac.local"
	

	config.vm.provider "virtualbox" do |vb|
		vb.gui = false
		vb.memory = "2048"
		vb.cpus=1
		vb.name = "CustomVagrantMachine"
	end
	
	#launches 2 seperate machines and assignes them ip's and ports
	config.vm.define "vagrantVirtualMasterMachine" do |masterDG|
		masterDG.vm.hostname = "masterDG.gac.local"
		masterDG.vm.network "public_network", ip: "192.168.1.28"
		config.vm.provision "shell", path: "GitJava.sh"
		config.vm.provider "virtualbox" do |vb|
			vb.name = "Machine A"
		end
	end
	
	config.vm.define "vagrantVirtualAgentMachine" do |agentDG|
		agentDG.vm.hostname = "agentMachine.gac.local"
		agentDG.vm.network "public_network", ip: "192.168.1.128"
		config.vm.provision "shell", path: "GitJava.sh"
		config.vm.provision "shell", path: "MavenJenkins.sh"	
		config.vm.provider "virtualbox" do |vb|
			vb.name = "Machine B"
		end
	end
		
end
